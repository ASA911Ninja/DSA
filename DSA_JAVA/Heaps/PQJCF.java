package Heaps;
// Priority Queues

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQJCF {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s){ // method overloading
            return this.rank-s.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("hi", 100));
        pq.add(new Student("bye", 20));
        pq.add(new Student("die", 30));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" -> "+pq.peek().rank);
            pq.remove();
        }


    }
}
