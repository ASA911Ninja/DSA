package OOPS;

public class methodover {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(8.2f,1.8f));
        System.out.println(calc.sum(1,2,3));
        Deer d = new Deer();
        d.eats();
    }

}
// Method Overriding -- Start
class Animal{
    void eats(){
        System.out.println("Eats Anything");
    }
}
class Deer extends Animal{
    void eats(){
        System.out.println("Eats grass");
    }
}
// End
// Method Overloading Example
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    float sum(float a, float b, float c){
        return a+b+c;
    }
}
