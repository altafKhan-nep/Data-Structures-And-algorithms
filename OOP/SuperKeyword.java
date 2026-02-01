package OOP;

public class SuperKeyword {

    public static void main(String[] args) {
        Hourse h = new Hourse();
        System.out.println(h.color);


    }
}
class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor called!");
    }
}
class Hourse extends Animal{
    
    Hourse(){
        super.color = "Brown";
        System.out.println("Hourse constructor called!");
    }
}