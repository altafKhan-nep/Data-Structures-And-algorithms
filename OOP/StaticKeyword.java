package OOP;

public class StaticKeyword {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Universal College";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "GEMS";

        Student s4 = new Student();
        System.out.println(s4.schoolName);
        System.out.println(s4.getPercentage(90,88,  100));
        s4.setName("Altaf Khan");
        System.out.println(s4.getName());
    }

}

class Student{
    String name;
    String roll;
    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    int getPercentage(int phy,int chem,int math){
        return (phy+chem+math)/3;
    }
}