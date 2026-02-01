public class BubbleSort {

    public static void sorting(int nums[]){
        int n = nums.length;
        for(int turns = 0;turns<n-1;turns++){
            int swap = 0;
            for(int j=0;j<n-1-turns;j++){
                if(nums[j] > nums[j+1]){
                    // swaping
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            // checking that the array is alredy sorted or not
                if (swap == 0) {
                    System.out.println("Array already sorted, stopping early");
                    break;
                    
                }            
        }
    }
    public static void printArr(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {5,4,1,2,3};
        // int nums[] = {1,2,3,4,5};
        sorting(nums);
        printArr(nums);
    }
}