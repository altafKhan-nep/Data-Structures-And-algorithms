public class lastOcuuranceIdx{

    public static int lastOccurance(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        // look foreward
        int isFound = lastOccurance(arr, key, i+1);

        //compare withself
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {7,7,7,7,7};
        System.out.println(lastOccurance(arr, 7, 0));
    }
}