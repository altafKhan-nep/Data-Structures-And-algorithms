// Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not

public class LeapYear {

    public static void main(String[] args) {
        int year = 2;
        if((year % 4) == 0){
            if((year % 100) == 0){
                if ((year % 400) == 0) {
                    System.err.println("Leap year!");
                }else{
                    System.out.println("Not a Leap year!");
                }
            }else{
                System.err.println("Leap year!");
            }

        }else{
            System.err.println("Not a leap year!");
        }

    }
}