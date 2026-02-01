import java.util.Scanner;

public class PrintNumber1ToN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number that upto you like to print!");
        int n = sc.nextInt();
        int counter = 1;

        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("Number is printed successfully 1 to "+n);
    }
}