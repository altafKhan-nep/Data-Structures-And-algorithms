public class FrindsPairingProblem {
    public static int pairingWays(int n){
        // base case
        if(n == 1 || n == 2){
            return n;
        }
        // kaam
        // return pairingWays(n - 1) + (n-1)*pairingWays(n-2);

        // choice
        // 1.single
        int fm1 = pairingWays(n-1);
        // 2.pair
        int fm2 = pairingWays(n-2);
        int pairWays = (n-1) * fm2;

        // total ways 
        int totWays = fm1 + pairWays;
        return totWays;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Total ways "+pairingWays(n));
    }
}