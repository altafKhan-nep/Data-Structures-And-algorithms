package Assingnment;

public class SwapTwoNumWithoutThird {
    public static void main(String[] args) {
        int a = 5,b=10;
        System.out.println("Before swap: x = "+a+" and y = "+b);

        // swap using xor
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: x = "+a+" and y = "+b);
        
    }
}