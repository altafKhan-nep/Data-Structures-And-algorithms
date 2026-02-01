public class MaxSubArraySum {
    public static void maxSubarray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        //start loop
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            //end loop
            for(int j=0;j<numbers.length;j++){
                int end = j;
                 currSum = 0;
                // print sub arrays
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k] +" ");
                    currSum+=numbers[k];
                }
                System.out.println();
            }
            System.out.println("max sum:"+currSum);
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        System.out.println("Max Sum of the sub arrays "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubarray(numbers);
    }
}