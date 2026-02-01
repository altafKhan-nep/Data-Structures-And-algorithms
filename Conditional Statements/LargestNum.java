public class LargestNum {

    public static void main(String[] args) {
        int x = 1,y = 3,z = 6;
        if(x >= y && x >= z){
            System.out.println(x +" is a greatest number!");
        }else if (y >= z) {
            System.out.println(y +" is a greatest number!");
        }else{
            System.out.println(z +" is a greatest number!");
        }
    }
}