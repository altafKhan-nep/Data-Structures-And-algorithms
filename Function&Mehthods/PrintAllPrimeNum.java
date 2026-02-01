public class PrintAllPrimeNum {

        public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    // print prime
    public static void printPrimeNum(int num){
       for(int i =2;i<=num;i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }
       }
       System.out.println();
    }
    public static void main(String[] args) {
        printPrimeNum(100);
    }
}