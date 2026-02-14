public class CheckSortedArr {

    public static boolean isSort(int arr[],int i){
        if(i == arr.length -1){ //base case
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSort(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,10,8,9};
        System.err.println(isSort(arr, 0));
    }
}