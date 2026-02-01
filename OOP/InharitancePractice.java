package OOP;

public class InharitancePractice {
    public static void main(String[] args) {
    // // mammals
    // Mammal m1 = new Mammal();
    // m1.eat();

    // hourse
    Hourse ahad = new Hourse();
    ahad.ride();
    ahad.breathe();
    ahad.color = "Brown";
    System.out.println(ahad.color);
    
    }
    
}
// base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
// derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Mammal extends Animal{
    int leg;
    void walk(){
        System.out.println("walk");
    }
}

// derived class to derived class

class Shark extends Fish{
    void name(){
        System.out.println("hey,I am shark");
    }
}

class Peacock extends Bird{
    void sing(){
    System.out.println("Yes i can sing!");
    }
}

class Hourse extends Mammal{
    void ride(){
        System.out.println("I am runner and loved by faithful people");
    }
}

