package Strings;

import java.util.Scanner;

class Strings {

    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // String are immutable in java
    //     char arr[] = {'a','b','c','d'};
    //     String str = "abcd";
    //     String str2 = new String("abcd");
    //     Scanner sc = new Scanner(System.in);
    //     String name;
    //     name = sc.nextLine();
    //     System.out.println(name);

    // length 
    // String fullName = "Ayotollah Ali";
    // System.out.println(fullName.length());

    // concatination
    // String firstName = "Altaf";
    // String lastName = "Khan";

    // System.out.println(firstName+" "+lastName);

    // String str = "Altaf Khan";

    // individual charAt()
    
    // printLetter("altaf");

    // String comparisions
    // String s1 = "Altaf";
    // String s2 = "Altaf";
    // String s3 = new String("Altaf");

    // if(s1 == s2){
    //     System.out.println("String are equals!");
    // }else{
    //     System.out.println("String are not equals!");
    // }

    // if(s1 == s3){
    //     System.out.println("String are equals!");
    // }else{
    //     System.out.println("String are not equals!");
    // }

    // comparision function
    // if(s1.equals(s3)){
    //     System.out.println("String are equals");
    // }else{
    //     System.out.println("String are not equals!");
    // }
    // // substrig of the string 
    // String strhell = "hello,world";

    // System.out.println(strhell.substring(0,5));

    // String Builder
    StringBuilder sb = new StringBuilder("");
    for(char ch = 'a';ch<='z';ch++){
        sb.append(ch);
        // O(26)
        // O(26*n^2)
    }
    System.out.println(sb);
    }
}