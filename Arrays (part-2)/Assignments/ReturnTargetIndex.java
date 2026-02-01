package Assignments;

public class ReturnTargetIndex {
    public static int ReturnIndex(int nums[],int target){
      for(int i=0;i<nums.length;i++){
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int num[] ={1,2,3,4,5};
        int target =5;

        int output = ReturnIndex(num,target);
        System.out.println(output);
    }
    
}