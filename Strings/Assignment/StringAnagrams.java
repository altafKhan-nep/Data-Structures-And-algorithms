package Strings.Assignment;

import java.util.Arrays;

public class StringAnagrams {

    public static void anagrams(String str1,String str2){

        // check the length is same or not
        if(str1.length() != str2.length()){
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other");
        }
        // 1.Change string to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
       // 2. Convert the string to a character array
        char str1CharArr[] = str1.toCharArray(); 
        char str2CharArr[] = str2.toCharArray();
       // 3. Sort the character array (sorts based on ASCII values)
        Arrays.sort(str1CharArr);
        Arrays.sort(str2CharArr);

    //    // 4. Convert the sorted array back to a string
    //    String str1Sorted = new String(str1CharArr);
    //    String str2Sorted = new String(str2CharArr);
    // // check
    // if(str1Sorted.equals(str2Sorted)){
    //     return true;
    // }
    if(Arrays.equals(str1CharArr,str2CharArr)){
         System.out.println(str1 + " and " + str2 + " are  anagrams of each other");
    }
    
    }
    public static void main(String[] args) {
        anagrams("hello", "hELLo");
        
    }
}