
import java.util.Scanner;

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex((a.real * b.real - a.imag * b.imag),
                           (a.real * b.imag + a.imag * b.real));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else if (imag < 0) {
            System.out.println(real + " - " + (-imag) + "i");
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }
}

public class ComplexCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        // Input second complex number
        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        // Perform operations
        Complex sum = Complex.add(c1, c2);
        Complex diff = Complex.diff(c1, c2);
        Complex prod = Complex.product(c1, c2);

        // Display results
        System.out.print("Sum: ");
        sum.printComplex();

        System.out.print("Difference: ");
        diff.printComplex();

        System.out.print("Product: ");
        prod.printComplex();

        sc.close();
    }
}
