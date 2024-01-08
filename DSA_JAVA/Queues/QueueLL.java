package Queues;

public class QueueLL {
    static class Node {
        int data;
        Node next;
        Node (int data){
            this.data=data;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        public static void add(int val){
            Node newNode = new Node(val);
            if (head==null){
                head=tail=newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if (tail==head){ // if there is only single element
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;

        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(100);
        q.add(200);
        q.add(700);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
