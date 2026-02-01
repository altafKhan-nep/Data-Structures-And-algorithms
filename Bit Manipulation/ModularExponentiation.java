public class ModularExponentiation {

    public static int modExp(int a,int b,int m){
        int result = 1;
         a = a % m;
         while (b > 0) {
            if ((a & 1) != 0) { // if exponent is odd or LSB is 1
                result = (result * a) % m; 
            }
            a = (a * a) % m; // square the base
            b = b >> 1; // divide the exponent by 2
         }
         return result;

    }
    public static void main(String[] args) {
        System.out.println(modExp(3, 13, 7));
        
    }
}