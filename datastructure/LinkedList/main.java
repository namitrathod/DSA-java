package LinkedList;

public class main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.insertFirst(8);
        // list.insertFirst(2);
        // list.insertFirst(5);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(100, 3);
        // // list.display();
        // // System.out.println(list.deletefirst());
        // // list.display();
        // // System.out.println(list.deletelast());
        // // list.display();
        // // System.out.println(LL.size);
        // list.display();
        // System.out.println(list.delete(2));
        // list.display();


        // DoublyLinkList list = new DoublyLinkList();
        // list.insertFirst(8);
        // list.insertFirst(2);
        // list.insertFirst(5);
        // list.insertFirst(17);
        // list.insertlast(11);
        // list.insertAfter(8, 10);
        // list.display();
        // list.Revdisplay();


        curcularLL list = new curcularLL();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(10);
        list.delete(6);
        list.display();

    }
}
