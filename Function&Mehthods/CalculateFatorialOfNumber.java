public class CalculateFatorialOfNumber {

    public static int Factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int num = 3;
        System.err.println("Factorial of " + num + " is " + (Factorial(num)));
    }
}