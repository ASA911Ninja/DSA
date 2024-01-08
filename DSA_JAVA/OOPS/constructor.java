package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Arya");
        Student s3 = new Student(53);
    }
}

class Student {
    String name;
    int roll;
    // Student(String name,int roll){ // the block of code written here is not necessary as java creates a default constructor
    //     this.name=name;
    //     this.roll=roll;
    // }
    Student(){
        System.out.println("Constructor is called ");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
    //this is called constructor overloading. this is an example of polymorphism
}
