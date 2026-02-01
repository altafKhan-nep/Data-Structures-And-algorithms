package OOP;

public class Abstraction {

    public static void main(String[] args) {
        // Hourse h = new Hourse();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c = new Chicken();
        // c.walk();
        // System.out.println(c.color);

        Mustang m = new Mustang();
        // Animal -> Hourse -> Mustang


    }
}
abstract class Animal{
    String color;
    Animal(){
        // color = "brown";
        System.out.println("Animal constructor called!");
    }
    void eat(){
        System.out.println("animals eats");
    }

    abstract void walk(); // idea not implementaion
}

class Hourse extends Animal{
    Hourse(){
        System.out.println("Hourse constructor called!");
    }
    void chngColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on four legs");
    }
}

class Mustang extends Hourse{
    Mustang(){
        System.out.println("Mustang constructor called!");
    }
}

class Chicken extends Animal{
    void chngColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("Walk on 2 legs!");
    }
}