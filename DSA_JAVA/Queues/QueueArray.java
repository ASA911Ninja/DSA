package Queues;

public class QueueArray {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            size = n;
            arr = new int[n];
            rear = -1;


        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        // add or enqueue
        public static void add(int data){
            if (rear==size-1){   // COndition if queue is full
                System.out.println("Queue is full"); 
                return;
            }
            rear+=1;
            arr[rear] = data;

        }
        // remove or dequeue
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            for (int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear-=1;
            int front = arr[0];
            return front;
        }
        // peek 
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(12);
        q.add(10);
        q.add(100);
        while (!q.isEmpty()){
            System.out.println(q.peek()+"\t");
            q.remove();
        }
    }   
}
