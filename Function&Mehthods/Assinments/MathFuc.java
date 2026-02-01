/* READ & CODE EXERCISE
Search about(Google) & use the following methods of the Math class in Java:
a. Math.min( )
b. Math.max( )
c. Math.sqrt( )
d. Math.pow( )
e. Math.avg( )
f. Math.abs( ) */

package Assinments;

public class MathFuc {

    public static void main(String[] args) {
        int a = 2,b=3,c = 5;
        System.out.println("Min:"+(Math.min(a,b)));
        System.out.println("Max:"+(Math.max(a,b)));
        System.out.println("Square root: "+(Math.sqrt(4)));
        System.out.println("Power: "+(Math.pow(a,b)));
        // System.out.println("Average:"+(Math.avg(a,b)));
        System.out.println("Absoluter::"+(Math.abs(-3)));

    }
}