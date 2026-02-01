public class BinomialCoefficient {

    public static int Factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        return fact;
    }
    public static int BinomialCoefficient(int n,int r){
        // int ans = Factorial(n) / (Factorial(r) * Factorial(n-r));
        // return ans;

        int n_fact = Factorial(n);
        int r_fact= Factorial(r);
        int nmr_fact = Factorial(n-r);
        
        int nCr = n_fact / (r_fact * nmr_fact);

        return nCr;

       
    }
    public static void main(String[] args) {
        int n = 5, r=2;
        int nCr = BinomialCoefficient(n, r);
        System.out.println("Binomial Coefficicent is "+ nCr);
    }
}