package OOP;

public class InterfaceCheasePlayer {

    public static void main(String[] args) {
        King k = new King();
        k.moves();

        Bear b = new Bear();
        b.eat();
        b.teath();
    }
}
// Animal interface carnvore and omnivore

interface Carnvore{
    void eat();
}
interface Omnivore{
    void teath();
}

class Bear implements Carnvore,Omnivore{
    public void eat(){
        System.out.println("Eat Grass");
    }
    public void teath(){
        System.out.println("The nature design that easily able to eat meat!");
    }
}
// chess player
interface ChessPlayer{
    void moves(); // public , static & without implementation
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonal (By one block)");
    }
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonal (any direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}