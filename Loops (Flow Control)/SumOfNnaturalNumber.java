import java.util.Scanner;

public class SumOfNnaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto you like to sum:");
        int counter =1,sum=0;
        int num = sc.nextInt();
        while (counter <= num) {
            sum +=counter;
            counter++;
        }
        System.out.println("The sum of "+num+" natural number is "+sum);
    }
}