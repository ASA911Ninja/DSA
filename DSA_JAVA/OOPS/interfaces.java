package OOPS;

public class interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        Bear kuma = new Bear();
        kuma.eat();
        kuma.eats();
    }
}
// Multiple Inheritance Implementation - Start
interface Herbivores{
    void eat();
}
interface Carnivores{
    void eats();
}
class Bear implements Herbivores,Carnivores{
    public void eat(){
        System.out.println("Eats Grass");
    }
    public void eats(){
        System.out.println("Eats Meat");
    }
}
// Ends

interface ChessPiece {
    void moves();
}

class Queen implements ChessPiece{
    public void moves(){
        System.out.println("up, down, left, right and diagonal - steps: Unlimited");
    }
}

class King implements ChessPiece{
    public void moves(){
        System.out.println("up, down, left, right and diagonal - steps: 1");
    }
}

class Rook implements ChessPiece{
    public void moves(){
        System.out.println("up, down, right, left - steps: Unlimited");
    }
}

