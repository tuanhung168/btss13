package treemap.bt04;


public class PreOrderTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(27);
        tree.add(14);
        tree.add(10);
        tree.add(19);
        tree.add(35);
        tree.add(31);
        tree.add(42);
        tree.preOrderTree(tree.root);
    }
}
