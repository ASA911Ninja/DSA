package OOPS;

public class abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Chicken chick = new Chicken();
        System.out.println(h1.legs());
        System.out.println(chick.legs());
        System.out.println(h1.color);
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract int legs();
}

class Horse extends Animal{
    int legs(){
        return 4;
    }
    Horse(){
        System.out.println("Horse constructor is called");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    int legs(){
        return 2;
    }
}