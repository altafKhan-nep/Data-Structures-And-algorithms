import java.util.Scanner;

public class CheckIsNumPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        boolean isPrime = true;
        // condition

        if(num == 2){
            System.out.println(num+ " is a prime number!");
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime = false;
                }
                    }
        
        if(isPrime == true){
            System.out.println(num+ " is a prime number!");
        }else{
            System.out.println(num+ " is a not prime number but composite number!");
        }
        }
        
        
    }
}