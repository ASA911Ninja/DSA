package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class syntax {
    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        syntax ll = new syntax();
        ll.head= new Node(0);
        ll.head.next = new Node(3);
        System.out.println(tail.next);
        
    }

}
