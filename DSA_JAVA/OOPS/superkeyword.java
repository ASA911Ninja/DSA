package OOPS;

public class superkeyword {
    public static void main(String[] args) {
        Horse stallion = new Horse();
        System.out.println(stallion.color);
        
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color="Black";
        System.out.println("Horse constructor is called");
        
    }
}
