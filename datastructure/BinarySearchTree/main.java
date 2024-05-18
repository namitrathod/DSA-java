package BinarySearchTree;

public class main {
    public static void main(String[] args) {
        Bst tree = new Bst();
        int[] arr = {5,3,4,7,8,9,1,2};
        tree.populate(arr);
        tree.display();
    }
}
