package treemap.bt01;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> productList = new ArrayList<>();
    public List<Product> getAll(){
        return productList;
    }
    public int getSize(){
        return  productList.size();
    }

    public Product findById(int id){
        for (Product product : productList) {
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }

    public void save(Product product) {
        if (findById(product.getId()) == null) {
            productList.add(product);
        } else {
            productList.set(productList.indexOf(findById(product.getId())),product);
    }
    }
    public void delete(int id){
        if(findById(id)==null){
            System.err.println("Id không tồn tại");
            return;
        }
        productList.remove(findById(id));
    }
    public int getNewId(){
        int max = 0;
        for (Product product : productList) {
            if(product.getId()>max){
                max = product.getId();
            }
        }
        return max+1;
    }

}
