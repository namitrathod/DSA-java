package StackandQueue;

public class queueMain {
    public static void main(String[] args) throws Exception {
        // customQueue queue = new customQueue(6);
        // queue.insert(10);
        // queue.insert(12);
        // queue.insert(45);
        // queue.insert(37);
        // queue.insert(24);

        // queue.display();
        // System.out.println(queue.remove());
        // queue.display();

        circularQueue queue = new circularQueue(5);
        queue.insert(10);
        queue.insert(12);
        queue.insert(45);
        queue.insert(37);
        // queue.insert(24);

        queue.display();
        System.out.println(" "+queue.remove() +" removed");


        queue.display();
    }
}
