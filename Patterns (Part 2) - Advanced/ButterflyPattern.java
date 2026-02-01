public class ButterflyPattern {

    public static void patterns(int n){
        
        // first half
        for(int i=1;i<=n;i++){
            // star - i 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space - 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n;i>=1;i--){
            // star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        patterns(13);
    }
}