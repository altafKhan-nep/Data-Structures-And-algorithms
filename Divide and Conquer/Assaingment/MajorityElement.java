// // Approch-1: brute force with Time complexity - O(n^2)
// public class MajorityElement {
//     public static int majorityElement(int nums[]){
//         int majorityCount = nums.length/2;
//         for(int i=0;i<nums.length;i++){
//             int count = 0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j] == nums[i]){
//                     count++;
//                 }
//             }
//             if(count > majorityCount){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int nums[] = {2,2,1,1,1,2,2};
//         System.out.println(majorityElement(nums));
//     }
// }

// Approach 2- Divide & Conquer with Time complexity - O(n*logn)

public class MajorityElement {

    public static int countInRange(int []nums,int num,int si,int ei){
        int count = 0;
        for(int i=si;i<= ei;i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int majorityElementRec(int []nums,int si,int ei){
        // base case; the only element in the array of size1 is the majority element
        if(si == ei){
            return nums[si];
        }

        // recurse on left and right halves of this slice.
        int mid = si + (ei - si)/2;
        int left = majorityElementRec(nums, si, mid);
        int right = majorityElementRec(nums, mid+1, ei);

        // if the two halves agree on the majority element, return it.
        if(left == right){
            return left;
        }
        // otherwise, count each element and return the "winner".

        int leftCount = countInRange(nums, left, si, ei);
        int rightCount = countInRange(nums, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int[] nums){
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,1,1,1,1,2};
        System.out.println(majorityElement(nums));
    }
}