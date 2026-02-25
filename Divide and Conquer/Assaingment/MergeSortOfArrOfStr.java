public class MergeSortOfArrOfStr {

    public static void printArr(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static String[] mergeSort(String arr[],int si,int ei){
        // base case
        if(si ==ei){
            String[] A = {arr[ei]};
            return A;
        }
        // kaam or work
        int mid = si + (ei - si)/2;
        String[] arr1 = mergeSort(arr, si, mid);
        String[] arr2 = mergeSort(arr, mid+1, ei);
        String[] arr3 = merge(arr1,arr2);
        return arr3;

    }
   public static String[] merge(String[] arr1,String[] arr2){
    int m = arr1.length;
    int n = arr2.length;
    String[] arr3 = new String[m+n];

    int idx = 0;
    int i = 0;
    int j = 0;

    while (i <m && j < n) {
        if(isAlphabeticallySmaller(arr1[i], arr2[j])){
            arr3[idx] = arr1[i];
            idx ++;
            i++;
        }else{
            arr3[idx] = arr2[j];
            idx++; j++;
        }
    }
    // remaining
    while (i<m) {
        arr3[idx] = arr1[i];
        idx++;i++;
    }
    while (j<n) {
        arr3[idx] = arr2[j];
        idx++; j++;
    }
    return arr3;
   }

//    Return true if str1 appears before str2 in alphabeticall order
   public static boolean isAlphabeticallySmaller(String str1,String str2){
    if(str1.compareTo(str2) < 0){
        return true;
    }
    return false;
   }
    public static void main(String[] args) {
        String str[] = {"sun","earth","mars","mercury"};
        String a[] = mergeSort(str, 0, str.length-1);
        printArr(a);
    }
}