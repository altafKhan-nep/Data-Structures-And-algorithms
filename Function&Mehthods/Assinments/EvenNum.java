// Write a method named isEven that accepts an int argument. The method
// should return true if the argument iseven ,or false otherwise.Also write a program to test your
// method.
package Assinments;

public class EvenNum {

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(3));
    }
}