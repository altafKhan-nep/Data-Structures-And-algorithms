import java.util.Scanner;

public class SumOfOddEvenNumByUserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0,oddSum =0;
        int choice = 1;
        do{
            System.out.print("Enter a number:");
            int num = sc.nextInt();
            if(num % 2 == 0){
                evenSum +=num;
            }else{
                oddSum +=num;
            }
            System.out.println("Enter 1 if you want to continue or enter in number to exist");
            choice = sc.nextInt();
        }while(choice ==1);
        System.out.println("Sum of odd number is "+oddSum);
        System.out.println("Sum of even number is "+evenSum);
    }
}