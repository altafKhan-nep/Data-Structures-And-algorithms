import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void printArr(Integer nums[]){
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int []arr = {5,2,3,1,4};
        // Arrays.sort(arr,0,3);
        // printArr(arr);

        // descending 
        Integer []arr = {1,3,5,4,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}