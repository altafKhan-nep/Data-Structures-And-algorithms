package OOP;

public class Polymorphism {

    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2,3));    
        // System.out.println(calc.sum((float)2.2,(float)3.8));     
        // System.out.println(calc.sum(2,3)); 

        Deer d1 = new Deer();
        d1.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eat anything!");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eat grasses!");
    }
}
class Calculator{
    int sum(int a ,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}