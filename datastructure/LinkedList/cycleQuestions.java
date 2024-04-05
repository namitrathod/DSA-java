package LinkedList;

import org.w3c.dom.Node;

public class cycleQuestions {


    private class Node {
        private int value;
        private Node next;

        public Node(int value){
                this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }




    //  length of the linklist cycle
     
    public int lengthOfCycle(Node head){
        Node fast = head;
        Node slow = head;

    while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast==slow){
            Node temp= slow;
            int length = 0;
            do{
                temp =temp.next;
                length ++;
            }while(temp!=fast);
            return length;
        }
    }
    return 0;
    }
}
