package OOP.Question;

public class CorrectStatement {
    public static void main(String[] args) {
        Student c = new Student();
        c.name = "Arif Khan";
        System.out.println(c.name);
    }
}

class Student{
    String name;
    int marks;
}
