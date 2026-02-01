// Question2: Finish the following code so that it prints You have a fever if your temperature is  above 100 and otherwise prints You don't have a fever.
public class Fever {

    public static void main(String[] args) {
        double temp = 100;

        if(temp > 100){
            System.out.println("You have a fever!");
        }else{
            System.out.println("No Fever!");
        }
    }
}