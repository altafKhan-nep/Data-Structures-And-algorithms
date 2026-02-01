public class OddOrEven {

    public static void isEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n+" is even number!");
        }else{
            System.out.println(n+" is odd number!");
        }
    }


    public static void main(String[] args) {
        // isEven(1);

    }
}