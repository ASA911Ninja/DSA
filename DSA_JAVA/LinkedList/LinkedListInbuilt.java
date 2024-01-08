package LinkedList;
import java.util.LinkedList;

public class LinkedListInbuilt {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        
        ll.addLast(7);
        ll.addFirst(0);
        ll.addLast(2);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }
}
