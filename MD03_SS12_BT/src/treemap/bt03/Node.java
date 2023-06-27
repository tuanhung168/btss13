package treemap.bt03;

public class Node<E> {
    E element;
    Node<E> left;
    Node<E> right;
    public Node(E e) {
        this.element = e;
    }
    public boolean search(Node<Integer> root, Integer element) {
        Node<Integer> current = root;
        while (current != null) {
            if (element < current.element) {
                current = current.left;
            } else if (element > current.element) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }
    public boolean delete(Node<Integer> root, Integer element) {
       Node<Integer> current = root;
        Node<Integer> parent = null;
        // Tìm kiếm node chứa giá trị e và node cha của nó
        while (current != null && !current.element.equals(element)) {
            parent = current;
            if (element.compareTo(current.element) < 0)
                current = current.left;
            else
                current = current.right;
        }
        if (current == null)
            return false;
        if (current.left == null) {
            if (parent == null)
                root = current.right;
            else {
                if (element.compareTo(parent.element) < 0)
                    parent.left = current.right;
                else
                    parent.right = current.right;
            }
        }
        else {
            Node<Integer> rightMostParent = current;
            Node<Integer> rightMost = current.left;
            while (rightMost.right != null) {
                rightMostParent = rightMost;
                rightMost = rightMost.right;
            }
            current.element = rightMost.element;
            if (rightMostParent.right == rightMost)
                rightMostParent.right = rightMost.left;
            else
                rightMostParent.left = rightMost.left;
        }
        return true;

    }
}
