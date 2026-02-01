package Assingnment;

public class UpperCaseCharToLower {

    public static void main(String[] args) {
        // upper case charater to lower case character
        for(char ch ='A';ch<'Z';ch++){
            System.out.print((char) (ch | ' ') + " ");
        }
        System.out.println();
    }
}