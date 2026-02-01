package Assignments;

public class ThreeSum {
    public static Boolean threeSum(int nums[]){
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;i++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        return true;
                    }
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
    int nums[] = {-1,0,1,2,-1,-4};
    System.out.println(threeSum(nums));
    }
    
}