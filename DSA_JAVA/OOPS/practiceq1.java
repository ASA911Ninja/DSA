package OOPS;

public class practiceq1 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car(); // Function Overriding if both have same name for print functions
        obj1.print();
        // obj1.print1() will give an error (refer notes)
        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base Class(Vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived Class(Car)");
    }
    void print1(){
        System.out.println("Derived Class(Car)");
    }
}
