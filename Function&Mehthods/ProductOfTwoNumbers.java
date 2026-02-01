public class ProductOfTwoNumbers {
    
    public static int ProductOfTwoNumbers(int x,int y){
        return x*y;
        
    }
    public static void main(String[] args) {
        int a = 3,b = 5;
        int product = ProductOfTwoNumbers(a, b);
        System.out.println("Product is "+product);
    }
}