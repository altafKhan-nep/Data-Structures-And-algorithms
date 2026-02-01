package Assignments;

public class EfficientWayReturnTargetIndex {
    public static int fndTarIdx(int arr[],int tar){
        int st = 0,end = arr.length-1;

        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == tar){
                return mid;
            }
            // check i. left side is sorted or ii.right side sorted
           
            if(arr[st] <= arr[mid]){ // left side sorted
                if(arr[st] <= tar && tar <= arr[mid]){
                    end = mid -1;
                }else{
                    st = mid + 1;
                }

            }else{ // right side sorted
                if(arr[mid] <= tar && tar <= arr[end]){
                    st = mid + 1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[] = {3,4,5,6,7,0,1,2};
        int arr[] = {6,7,0,1,2,3,4,5};
        int tar = 0;

        int val = fndTarIdx(arr,tar);
        System.out.println(val);
    }
    
}