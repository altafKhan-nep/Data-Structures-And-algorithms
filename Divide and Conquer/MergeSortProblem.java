public class MergeSortProblem {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        // base case
        if(si >= ei){
            return;
        }
        // kaam or work
        
        int mid = si + (ei-si)/2; //find middle index
        mergeSort(arr, si, mid); // sort left half
        mergeSort(arr, mid+1, ei); // sort righ half
        merge(arr, si, mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        // left(0,3)= 4el right(4,6)= 3el -> 6 - 0 + 1 = 7el
        int temp[] = new int[ei - si + 1];
        int i = si; //  pointer for left half
        int j = mid+1; // iterator for right part 
        int k = 0; // iterator temp array

        // Compare elements from both halves
        while(i <=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            }else{
                temp[k] = arr[j];
                j++; 
            }
            k++;
        }
        

        // Copy leftover elements from left half (due && condition)
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // Copy leftover elements from right half
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // Copy sorted temp array back to original
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}








