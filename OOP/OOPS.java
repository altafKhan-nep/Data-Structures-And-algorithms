package OOP;

public class OOPS {
    public static void main(String[] args) {
        // // for pen class 
        // Pen p1 = new Pen();
        // p1.setColor("red");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // p1.tip = 7;
        // System.out.println(p1.tip);

        // // for student class
        // Student std1 = new Student();
        // std1.calcPercentage(97, 93, 72);
        // System.out.println(std1.percentage);

        BankAccount myAcc = new BankAccount();
        myAcc.unsername ="MohammadAltaf";
        System.out.println(myAcc.unsername);
        // myAcc.password = "123qrst"; // not access because is private
        myAcc.setPass("altf");
        myAcc.showPass();
        
    }

}
class BankAccount{
    public String unsername;
    private String password;
    void setPass(String newPass){
        password = newPass;
    }
    void showPass(){
        System.out.println(password);
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    };
    void setTip(int newTip){
        tip = newTip;
    };
}

class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int math,int phy, int chem){
        percentage = (math + phy + chem)/3;
    }

}