package AvlTree;

public class main {
    public static void main(String[] args) {
        avlTree tree = new avlTree();

        for(int i=0; i < 1000; i++) {
          tree.insert(i);
        }
    
        System.out.println(tree.height());
    }
}
