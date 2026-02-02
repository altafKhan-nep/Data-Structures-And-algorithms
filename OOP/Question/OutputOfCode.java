package OOP.Question;

public class OutputOfCode {

    public static void main(String[] args) {
        Vehicle obj1 = new Car(); // function overriding 
        obj1.print(); 

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}
class Vehicle{
    void print(){
        System.out.println("Base class (Vehicle)");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class (car)");
    }
}