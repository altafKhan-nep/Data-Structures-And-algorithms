package Operators;

public class Assignment {

    public static void main(String[] args){
        // Q4
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // System.out.println(exp);

        //Q5:
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        // (5 * ( 2 + 2)) = 5 * 4 = 20
        int exp2 = (y * x / y + y * x / y);
        // (50 / 5 + 50 /5) = (10 + 10 ) = 20
        System.out.println(exp1);
        System.out.println(exp2);
    }
}