package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class llops {
    public static Node head;
    public static Node tail;
    public static int size;

    public void print() {
        Node temp = head;

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void AddFirst(int data) {
        // Step1 - Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 - New Node next = head
        newNode.next = head;
        // Step3 - New head will be the newNode
        head = newNode;

    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void insert(int idx, int data) {
        if (idx == 0) {
            AddFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;

    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        int i = 0;
        Node temp = head;
        while (i < size - 2) {
            temp = temp.next;
            i++;
        }
        temp.next = null;
        tail = temp;
        size--;

    }

    public int searchIterative(int key) {
        int i = 0;
        Node ptr = head;
        while (ptr != null) {
            if (ptr.data == key) {
                return i;
            }
            ptr = ptr.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int searchRecursive(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find and remove nth node
    public void removenth(int n) {
        Node curr = head;
        Node prev = head;
        int i = 0;
        while (i < n - 1) {
            prev = prev.next;
            i++;
        }
        // i=0;
        // while(i<n){
        // curr = curr.next;
        // i++;
        // }
        curr = prev.next;
        prev.next = curr.next;
        curr.next = null;
    }

    public void removenthfromend(int n) {
        int i = 0;
        Node prev = head;
        while (i < size - n - 1) {
            prev = prev.next;
            i++;
        }
        if (n == size) {

        }
        Node curr = prev.next;
        prev.next = curr.next;

    }

    // Finding the middle node
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // if the ll has 0 or 1 elements it will return true
        }
        // Step 1 -> To find the middle node
        Node mid = findMid(head);
        // Step 2 -> Reverse 2nd Half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // Step 3 -> Check left and right half if they are equal
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }

        }
        return false;
    }
    public static void removeCycle(Node head){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                cycle = true;
                break;
            }
        }
        if(!cycle){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while (slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next = null;


    }

    public static void main(String[] args) {
        // llops ll = new llops();
        // ll.head = new Node(1);
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next.next;
        // System.out.println(isCycle(head));
        removeCycle(head);
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data +"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}
