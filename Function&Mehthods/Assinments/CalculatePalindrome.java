/* Write a Java program to check if a number is a palindrome in Java?(121 is a palindrome, 321 is not)
A number is called a palindrome if the number is equal to the reverse of a number e.g.,121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321
*/

 package Assinments;

import java.util.Scanner;

public class CalculatePalindrome {

    public static boolean isPalindrome(int number){
        int myNum = number;
        int reverse = 0;

        while(number != 0){
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number/10;
        }
        if(myNum == reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is a palindrome!");
        }else{
            System.out.println(num +" is not a Palindrome!");
        }
    }
}




