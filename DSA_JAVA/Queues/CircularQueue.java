package Queues;

class Queue {
    static int arr[];
    static int rear;
    static int size;
    static int front;

    Queue(int n) {
        size = n;
        arr = new int[n];
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public static boolean isFull() {
        return ((rear + 1) % size == front);
    }

    public static void add(int data) {
        if (isFull()) {
            System.out.println("the queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = arr[front];
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Queue q = new Queue(3);
        for (int i = 0; i < 3; i++) {
            q.add(i+1);
        }
        q.remove();
        q.add(4);
        while (!q.isEmpty()){
            System.out.println(q.peek()+"\t");
            q.remove();
        }
    }

}
