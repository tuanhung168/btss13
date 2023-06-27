package treemap.bt02;
public class BinaryTree {
        Node root;
        public BinaryTree() {
            root = null;
        }
    public Node addNode(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.data)
            node.left = addNode(node.left, data);
        else if (data >= node.data)
            node.right = addNode(node.right, data);
        return node;
    }
        public void add(int data) {
            root = addNode(root, data);
        }
        public void postOrderTree(Node node) {
            if (node == null) {
                return;
            }
            postOrderTree(node.left);
            postOrderTree(node.right);
            System.out.print(node.data + " ");
        }

}

