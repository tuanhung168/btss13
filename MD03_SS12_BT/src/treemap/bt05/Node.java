package treemap.bt05;

public class Node<E> {
        protected E element;
        protected Node<E> left; // khi khởi tạo sẽ có giá trị null
        protected Node<E> right; // khi khởi tạo sẽ có giá trị null
        // nhận vào e có kiểu dữ liệu E cần lưu trữ
        public Node(E e) {
            this.element = e;

        }
        public boolean search(Node<Integer> root,Integer element) {
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

}
