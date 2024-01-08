package OOPS;

public class test {
    public static void main(String[] args) {
        if (System.out.printf("Hello World") == null){
            
        }
    }
}

class Automobile{
    private String drive(){
        return "Driving vehicle";
    }
}

class Car extends Automobile{
    protected String drive(){
        return "Driving Car";
    }
}

// public class ElectricCar extends Car{
//     @Override
//     public final String drive(){
//         return "Driving Electric Car";
//     }
// }

