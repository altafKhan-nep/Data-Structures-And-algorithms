import java.util.*;
public class SumInputFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first number: ");
        int a = sc.nextInt();

        System.out.println("Enter a second number: ");
        int b = sc.nextInt();

        // calcule sum 
       int  sum = a + b;

       System.out.println("Sum is "+sum);
    }
}