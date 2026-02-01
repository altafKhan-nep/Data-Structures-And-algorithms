package OOP;

public class Inheritance {

    public static void main(String[] args) {
        Fish whale = new Fish();
        whale.eat();
        whale.swim();

        Dog kuta = new Dog();
        kuta.breathe();
        kuta.leg = 4;
        kuta.breed = "German sefat";
        System.out.println(kuta.leg + " "+ kuta.breed);
        
    }

}
class Animals{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("Swim in water!");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("fly");
    }
}
class Mammal extends Animals{
    int leg;
    void walk(){
        System.out.println("Walk");
    }
}
class Dog extends Mammal{
    String breed;
}