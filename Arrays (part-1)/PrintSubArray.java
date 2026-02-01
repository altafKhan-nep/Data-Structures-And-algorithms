public class PrintSubArray {

    public static void printSubarray(int number[]){
        int ts = 0;
        int sum =0;
        for(int i=0;i<number.length;i++){ //start
            sum =0;
            int start  =i;
            for(int j=i;j<number.length;j++){ //end
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                     sum = sum + number[k]; 
                }
               
                System.out.println();
                
                ts++;
            }
            System.out.println("sum of this sub array is: "+sum);
            System.out.println();

        }
        System.out.println("total subarray:"+ts);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printSubarray(number);
    }
}