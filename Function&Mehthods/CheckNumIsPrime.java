public class CheckNumIsPrime {

    // public static boolean isNumberPrime(int num){
    //     boolean isPrime = true;
    //     if (num == 2) {
    //         isPrime = true;
    //     }else{
    //     for(int i=2;i<=num-1;i++){
    //                 if(num % i == 0 ){
    //                     isPrime = false;
    //                     return isPrime;
    //                 }
    //             }
    //         }
    //         return isPrime;
    //     }
        
    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        for(int i=2;i<=num - 1; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPrime(2) == true){
            System.out.println("is a prime number");
        }else{
            System.out.println("Not a prime number!");
        }
    }
}