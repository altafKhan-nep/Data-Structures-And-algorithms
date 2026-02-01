public class SolidRhombus {

    public static void patterns(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // star - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // star - n-i
             for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();

        //    Alternative for printing of star
        // for(int j=1;j<=n;j++){
        //     System.out.println("*");
        // }
        // System.out.println();
        }
    }
    public static void main(String[] args) {
        patterns(5);
        
    }
}