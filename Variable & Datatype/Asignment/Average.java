//Question1:In a program,input 3 numbers:A,BandC.You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)
import java.util.*;
public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float average = (num1+num2+num3)/3;
        System.out.println(average);
    }
}