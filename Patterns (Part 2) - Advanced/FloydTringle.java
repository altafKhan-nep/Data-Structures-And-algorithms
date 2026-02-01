public class FloydTringle {

    public static void Patterns(int n){
        // outer loops -lines
        int count =1;
        for(int i=1;i<=n;i++){
            // inner - How many times will count will be printed
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Patterns(5);
    }
}