package OOPS;

public class inheritance {
    public static void main(String[] args) {
        Dog russel = new Dog();
        russel.eat();
        russel.birth();
        System.out.println(russel.legs=4);
    }
}
// Base Class or Parent Class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("braethes");
    }
}

// Derived Class or Subclass or Child class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("It swims");
//     }
// }
class Mammal extends Animal{
    int legs;
    void birth(){
        System.out.println("Doesnt lay eggs");
    }
}

class Dog extends Mammal{
    String breed;

}