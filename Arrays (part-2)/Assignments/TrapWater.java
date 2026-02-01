package Assignments;
public class TrapWater {

   public static int trap(int[] height) {
        // i.left side max boundary
        // ii.right max boundary
        // loop
            // minvalue = min(leftMaxBound,rightMaxBound)
            // trappedWater += minValue - height

        int trapWater = 0;
        int n = height.length;

        int leftMaxBound[] = new int[n];
        leftMaxBound[0] = height[0];
        for(int i=1;i<n;i++){
            leftMaxBound[i] = Math.max(height[i],leftMaxBound[i-1]);
        }

        int rightMaxBound[] = new int[n];
        rightMaxBound[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMaxBound[i] = Math.max(height[i], rightMaxBound[i+1]);
        }

        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMaxBound[i],rightMaxBound[i]);
            trapWater += waterLevel - height[i];
        }


        return trapWater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}