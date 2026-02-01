package Assinments;

public class SumOfDigites {

    public static int sumOfDigites(int num){
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int num = 54;
        System.out.println(sumOfDigites(num));
    }
}