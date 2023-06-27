package treemap.bt01;

import java.util.*;

public class ProductManagement {
    static ProductService productService = new ProductService();
    public static void main(String[] args) {
        boolean loop = true;
       while (loop){
           System.out.println("======Menu======");
           System.out.println("1. Hiển thị");
           System.out.println("2. Thêm");
           System.out.println("3. Sửa");
           System.out.println("4. Xóa");
           System.out.println("5. Tìm kiếm = Name");
           System.out.println("6. Sắp xếp theo giá tăng dần");
           System.out.println("7. Sắp xếp theo giá giảm dần");
           System.out.println("8. Thoát");
           System.out.println("Nhập lựa chọn của bạn: ");
           int choice = new Scanner(System.in).nextInt();
           switch (choice){
               case 1:
                   displayAll();
                   break;
               case 2:
                   add();
                   break;
               case 3:
                   edit();
                   break;
               case 4:
                   delete();
                   break;
               case 5:
                   search();
                   break;
               case 6:
                   sortAsc();
                   break;
               case 7:
                   sortDes();
                   break;
               case 8:
                   loop= false;
                   System.out.println("Thank you!");
                   System.exit(0);
               default:
                   System.err.println("Nhập đúng giá trị");
           }
       }
    }
    public static void displayAll(){
        if (productService.getSize()==0){
            System.out.println("Danh sách trống");
        }
        for(Product product:productService.getAll()){
            System.out.println(product);
        }
    }
    public static void add(){
        Product product = new Product();
       product.setId( productService.getNewId());
        System.out.println("Nhập tên sản phẩm: ");
        product.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        product.setPrice(new Scanner(System.in).nextDouble());
        productService.save(product);
    }
    public static void edit(){
        System.out.println("Nhập id sản phẩm muốn sửa");
        int editId = new Scanner(System.in).nextInt();
        Product updateProduct = productService.findById(editId);
        if(updateProduct==null){
            System.err.println("Không tìm thấy sản phẩm");
            return;
        }
        System.out.println("Old Product: ");
        System.out.println(updateProduct);
        System.out.println("New name: ");
        updateProduct.setName(new Scanner(System.in).nextLine());
        System.out.println("New price: ");
        updateProduct.setPrice(new Scanner(System.in).nextDouble());
        productService.save(updateProduct);
    }
    public static void delete(){
        System.out.println("Nhập id sản phẩm muốn xóa: ");
        int deleteId = new Scanner(System.in).nextInt();
        productService.delete(deleteId);
    }
    public static void search(){
        System.out.println("Nhập vào từ khóa: ");
        String keywords = new Scanner(System.in).nextLine();
        for(Product product: productService.getAll()){
            if(product.getName().contains(keywords)){
                System.out.println(product);
            }
        }
    }
    public static void sortAsc(){
        if (productService.getSize()==0){
            System.out.println("Danh sách trống");
        }
        List<Product> ascList = new ArrayList<>();
        ascList.addAll(productService.getAll());
        ascList.sort(Comparator.comparing(Product::getPrice));
        for(Product product:ascList){
            System.out.println(product);
        }
    }
    public static void sortDes(){
        if (productService.getSize()==0){
            System.out.println("Danh sách trống");
        }
        List<Product> desList = new ArrayList<>();
        desList.addAll(productService.getAll());
        desList.sort(Comparator.comparing(Product::getPrice).reversed());
        for(Product product:desList){
            System.out.println(product);
        }

    }
}
