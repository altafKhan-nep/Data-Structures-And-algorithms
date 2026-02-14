public class FirstOccuranceIdx {

    public static int firstOccurance(int arr[],int key,int i){
            if(arr.length == i){ //base case
                return -1;
            }

            if(arr[i] == key){
                return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,5,9,3,9};
        System.err.println(firstOccurance(arr, 9,0));

    }
}