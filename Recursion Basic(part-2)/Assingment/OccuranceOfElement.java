package Assingment;

class OccuranceOfElement {
    public static void allOccurance(int[] arr,int key,int idx){
        // base case
        if(idx == arr.length ){
            return;
        }
        // kaam 

        if(arr[idx] == key){
            System.out.print(idx +" ");
            
        }
        allOccurance(arr, key, idx+1);
        
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        allOccurance(arr, 2,0);
    }
}