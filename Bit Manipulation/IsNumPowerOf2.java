public class IsNumPowerOf2 {

    public static boolean IsNumPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(IsNumPowerOfTwo(14));
    }
}