public class InsertionSort {
    
    public static void sorting(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int prev = i-1;

            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;                
            }
            // insertion
            arr[prev+1] = curr;
            
        }
    }

    public static void printArr(int nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }    
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        sorting(arr);
        printArr(arr);        
    }
}