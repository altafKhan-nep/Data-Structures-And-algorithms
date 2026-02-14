public class PowerX {

    public static int pow(int x,int n){
        // base case
        if(n == 0){
            return 1;
        }

        return x * pow(x, n-1);
    }
    public static int optimizedPowe(int x, int n){
        // base case
        if(n == 0){
            return 1;
        }
        // int halfPowerSq = optimizedPowe(x, n/2) * optimizedPowe(x, n/2);
        int halfPower = optimizedPowe(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        // if power n  is odd
        if( n % 2 != 0){
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        // System.err.println(pow(2, 10));
        System.out.println(optimizedPowe(2, 10));
    }
}