public class CountingSort {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // sorting algorithm
    public static void sorting(int arr[]){
        // max Value or range
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(arr[i] ,largest);
        }

        // counting arr --> frequency
        int []count = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,4,1,3,2,4,3,7};
        sorting(arr);
        printArr(arr);
    }
}