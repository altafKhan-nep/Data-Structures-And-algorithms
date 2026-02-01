import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 4, num2 = 2;
        System.out.print("Enter a operator:");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("Sum is "+ (num1 + num2));
                break;
            case '-':
                System.out.println("Differnce is "+ (num1 - num2));
                break;
            case '*':
                System.out.println("Product is "+ (num1 * num2));
                break;
            case '/':
                System.out.println("Division is "+ (num1 / num2));
                break;    
            case '%':
                System.out.println("Remainder is "+ (num1 % num2));
                break;            
            default:
                System.out.println("Enter a valid operator! Try Again");
                break;
        }
    }
}