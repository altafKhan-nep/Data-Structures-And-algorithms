package OOP;

public class Constructors {
public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student("Altaf");
    Student s3 = new Student(3);
    // Student s4 = new Student("Altaf",3);
}
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("You called the constructor and it is instlized!");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}