package ship.developer;


public class BinaryTree<T extends Comparable> {
    private Node<T> root;

    public void add(T value) {
        if (root == null)
            root = new Node<>(value, 1);
        else {
            Node leaf = addRecursive(root, value);
            shuffleUp(leaf);
        }
    }

    private void shuffleUp(Node node) {
        if (node == null || node.parent == null)
            return;
        if (node.parent.right == node) {
            if (node.parent.left == null || node.parent.left.height < node.height) {
                node.parent.height = node.height + 1;
                shuffleUp(node.parent);
            } else
                shuffleUp(null);
        } else if (node.parent.right == null || node.parent.right.height < node.height) {
            node.parent.height = node.height + 1;
            shuffleUp(node.parent);
        } else
            shuffleUp(null);

    }

    public int getHeight(){
        return root.height;
    }

    private Node addRecursive(Node node, T value) {
        switch (node.value.compareTo(value)) {
            case -1:
                if (node.left == null) {
                    node.left = new Node<>(value, 1);
                    node.left.parent = node;
                    return node.left;
                } else
                    return addRecursive(node.left, value);
            case 0:
            case 1:
                if (node.right == null) {
                    node.right = new Node<>(value, 1);
                    node.right.parent = node;
                    return node.right;
                } else
                    return addRecursive(node.right, value);
        }
        return null;
    }

    class Node<S extends Comparable> {
        private S value;
        protected int height;
        private Node parent;
        private Node left;
        private Node right;
        private int maxDeep;

        public Node(S t, int height) {
            this.value = t;
            this.height = height;
        }

        public S getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getMaxDeep() {
            return maxDeep;
        }
    }
}

/*
public class binsearch {
    MyReader in;
    PrintWriter out;

    public static void main(String[] args) throws IOException {
        new binsearch().run();
    }

    private void run() throws IOException {
        in = new MyReader(new File("binsearch.in"));
        out = new PrintWriter(new File("binsearch.out"));

        solve();

        out.close();
    }

    private void solve() throws IOException {
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = in.nextInt();
        int count = in.nextInt();
        int value;
        for(int i = 0; i < count; i++){
            value =  in.nextInt();
            if (arr[arr.length - 1] < value || arr[0]>value ||  arr.length == 0){
                out.println("-1 -1");
                return;
            } else {
                BinarySearch(arr, 0, arr.length - 1, value);
            }
        }
    }

    private void BinarySearch(int[] arr, int left, int right, int value) {
        if(left > right){
            int mid = left + (left + right)/2;
            if(right - left == 1){
            }
            if(value < arr[mid]){
                BinarySearch(arr, left, mid, value);
                return;
            } else if(value > arr[mid]){
                BinarySearch(arr, mid, right, value);
                return;
            } else if(value == arr[mid]) {
                BinarySearch(arr, left, mid, value);
                //BinarySearch(arr, mid, right, value);
                return;
            } else{
                out.println("-1 -1");
                return;
            }
        } else{
            out.print(left + " ");
        }
    }

    /*private void BinarySearchMid(int[] arr, int left, int right, int value, boolean flag) {
        if(left < right){
            int mid = left + (left + right)/2;
            if(value <= arr[mid] && flag){
                if(value == arr[mid]){
                    BinarySearchMid(arr, left, mid, value, flag);
                }else
                BinarySearchMid(arr, mid, right, value, flag);
            }
        } else if(flag){
        }
    }*//*

}
*/
