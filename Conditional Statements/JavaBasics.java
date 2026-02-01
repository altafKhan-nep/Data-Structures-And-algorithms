public class JavaBasics {

    public static void main(String[] args) {
        int age = 23;
        if(age >=18){
            System.out.println("Adult: drive , vote");
        }
        else if(age  > 13 && age < 18){
            System.out.println("Teenageer");
        }
        else{
            System.out.println("not adult");
        }

        // Print Largest Number
    int A = 1,B = 3;
    if(A > B){
        System.out.println(A+" is a greater number!");
    }else{
        System.out.println(B+" is a greater number!");
    }
        // print if a number is odd or even
        int num =3;

    if (num % 2 == 0) {
        System.out.println(num+" is a even number!");
    }else{
         System.out.println(num+" is a odd number!");
    }

    // Ternary Operator
    int checkNum = 5;
    String type = ((checkNum % 2) == 0 ) ? "even": "odd";
    System.out.println(type);
    }
}