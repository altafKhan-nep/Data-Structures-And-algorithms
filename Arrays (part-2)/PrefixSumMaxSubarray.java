public class PrefixSumMaxSubarray {
    public static void maxSubarray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // calculate prefix array 
        for(int i=1;i<numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        
        //start loop
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            //end loop
            for(int j=0;j<numbers.length;j++){
                int end = j;
                 currSum = (start == 0) ? prefix[end] : prefix[end]-prefix[start -1];
                //  System.out.println("Subarray ("+start+","+end+") sum: "+currSum);
            }
            
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