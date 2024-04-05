package LinkedList;


public class mergeSort {
    public class ListNode {
        int val;
        ListNode next;


        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }



    }


    static void displayLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }



    // class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getmid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummuhead = new ListNode();
        ListNode tail = dummuhead;
        while (left != null && right != null) {
            if (left.val < right.val) {
                tail.next = left;
                left = left.next;
                tail = tail.next;
            } else {
                tail.next = right;
                right = right.next;
                tail = tail.next;
            }
        }
        // if(right!=null){tail.next = right;}
        // if(left!=null){tail.next = left;}

        tail.next = (left != null) ? left : right; // better and short way
        return dummuhead.next;

    }

    private ListNode getmid(ListNode head) {
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            head = head.next;
        }
        return head.next;
    }
    // }
    public static void main(String[] args) {
        mergeSort ms = new mergeSort(); // Create an instance of mergeSort
        ListNode head = ms.new ListNode(250); // Use it to create ListNode instance
        head.next = ms.new ListNode(200);
        head.next.next = ms.new ListNode(36);
        head.next.next.next = ms.new ListNode(40);
        head.next.next.next.next = ms.new ListNode(5);

        // Display the linked list
        displayLinkedList(head);
        ms.sortList(head);
    }

}