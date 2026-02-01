package OOP;

public class ConstrutorChaining {

    public static void main(String[] args) {
        // Student s = new Student();
        Teacher t = new Teacher();

    }
}

// within same classs using this()

class Student{
    Student(){
        this("Altaf");
        System.out.println("This is student constructor without any paramer");
    }
    
    Student(String name){
        System.out.println("You called parameterzied constor and your name is " + name);
    }
}

// Between parents and child using super() keyword

class Person{
    Person(){
        System.out.println("hello i am parent without any pareameters!");
    }
    Person(String name){
        System.out.println("hello i am parent with single parameter i.e :"+name);
    }
    Person(String name,int age){
        System.out.println("hello i am parent with dbl parameters i.e name:"+name +" age:"+age);
    }
}
class Teacher extends Person{
    Teacher(){
        super();
        System.out.println("Hey i am child!");
    }
}