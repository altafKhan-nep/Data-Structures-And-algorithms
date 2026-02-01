package Assingments;

public class BasicSorting {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // A.Bubble Sort
    public static void bubbleSort(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                // Sorting 
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // B.Selection Sort
    public static void selectionSort(int []arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                // find min postion index
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            // swap min number 
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
        }
    }
    // C.Insertion sort
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i]; // current value
            int prev = i-1; // prervius indx

            // findig out the correct position to insert
            while (prev > 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    // D.Counting sort
    public static void countingSort(int arr[]){
        // find largest value or a range
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        // count array initialize
        int []count = new int[largest+1];
        // count frequency
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // Build the sorted array
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while (count[i]>0) {
                arr[j] = i;                
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int []arr = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // selectionSort(arr);
        countingSort(arr);
        printArr(arr);

    }
}