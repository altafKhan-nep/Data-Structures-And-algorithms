import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float income = sc.nextFloat();
        float tax;
        if(income < 500000){
            tax = 0;
            System.out.println("Tax is "+ tax);
        }else if(income >= 500000 && income <1000000){
            tax = income * 0.20f;
            System.out.println("Tax is "+ tax);
        }else{
            tax = income * 0.30f;
            System.out.println("Tax is "+ tax);
        }
    }
}