// Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers

import java.util.Scanner;

public class SumOfOddEvenNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int oddSum = 0,evenSum = 0;

        for(int i=1;i<=num;i++){
            if(i % 2 == 0){
                evenSum +=i;
            }else{
                oddSum +=i;
            }
        }
        System.out.println("Sum of odd number is "+oddSum);
        System.out.println("Sum of even number is "+evenSum);
    }
}