package treemap.bt03;


public class DeleteTree {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(60);
        root.left = new Node<>(55);
        root.right = new Node<>(100);
        root.left.left = new Node<>(45);
        root.right.right = new Node<>(107);
        System.out.println(root.search(root,55)); // T
        root.delete(root,55);
        System.out.println(root.search(root,55)); // F

    }
}
