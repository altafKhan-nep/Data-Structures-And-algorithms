public class MaxSubarraySum {

    public static void subaarraySum(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<number.length;i++){ //start
            int start = i;
            for(int j=i;j<number.length;j++){ //end
                currSum = 0;
                int end = j;
                for(int k=start;k<=end;k++){
                    // subarray sum
                    currSum =  currSum + number[k];
                    
                }
                System.out.println(currSum);
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
            

        }
        System.out.println("Max sum is in subarray:"+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        subaarraySum(number);
    }
}