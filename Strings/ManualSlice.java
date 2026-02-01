package Strings;

public class ManualSlice {
    public static void substring(String str,int si,int ei){
        String substring = "";
        for(int i=si;i<ei;i++){
            substring += str.charAt(i);
        }
        System.out.println(substring);
    }

    public static void main(String[] args) {
        String str = "hello,world";
        substring(str,0,5);
    }
}