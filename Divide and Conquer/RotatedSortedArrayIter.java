public class RotatedSortedArrayIter {

    public static int search(int arr[],int tar,int si,int ei){
        while(si <= ei){
            int mid = si + (ei - si)/2;
            // case FOUND
            if(arr[mid] == tar){
                return mid;
            }
            // mid on L1
            if(arr[si] <= arr[mid]){
                // case: target left side
                if(arr[si] <= tar && tar <arr[mid]){
                    ei = mid - 1;  // target lies in left half
                }
                // case: targe left side
                else{
                    si = mid + 1; // target lies in right half
                }
            }
            // mid on L2
            else{
                // case: target right side
                if(arr[mid] <= tar && tar <= arr[ei]){
                    si = mid - 1; // target lies in right half
                }else{
                    ei = mid + 1; // target lies in left half
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 2;
        int fndIdx = search(arr, target, 0, arr.length-1);
        System.out.println(fndIdx);
    }
}