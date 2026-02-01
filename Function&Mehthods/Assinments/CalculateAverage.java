// Write a Java method to compute the average of three numbers..
package Assinments;

public class CalculateAverage {

    public static int average(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        int num1 = 1,num2 = 2,num3=4;
        int average_ans = average(num1, num2, num3);
        System.out.println(average_ans);

    }
    
}