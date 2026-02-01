public class InvNumHalfPyramid {

    public static void Patterns(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // int num = 1;
            // numbers
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
                // num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Patterns(5);
    }
}