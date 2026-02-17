package Assingment;

public class LengthOfString {

    // method-1
    public static void length(String str,int idx,int len){
        // Base case
        if(idx == str.length()){
            System.err.println(len);
            return ;
        }
        // kaam 
        length(str, idx+1,len+1);
        
    }
    // method -2
    public static int length(String str){
        // base case
        if(str.length() == 0){
            return 0;
        }
        // kaam 
        return length(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "MOohammadAltafKhan";
        
        length(str, 0,0);
        System.out.println(length(str));
    }
    
}