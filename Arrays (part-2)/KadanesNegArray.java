public class KadanesNegArray {
    public static void kadanes(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            currSum = Math.max(numbers[i], currSum+numbers[i]);
            maxSum = Math.max(currSum, maxSum);

        }
        System.out.println("Max sum is "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-1,-3,-4,-9,-7};
        kadanes(numbers);
    }
}