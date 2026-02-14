public class TilingWays {

    public static int tilingProblem(int n){ // 2xn floor size
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // kaam
        // verticall placing choice
        int fnm1 = tilingProblem(n-1);
        // horizontall placing choice
        int fnm2 = tilingProblem(n -2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4)+ " ways");
    }
}