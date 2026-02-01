public class BinarySearch {

    public static int binSech(int numbers[],int key){
        int start = 0;
        int end = numbers.length - 1;

        while (start <=end) {
            int mid = (start + end)/2;  // mid terms

            if(numbers[mid] == key){  //found 
                return mid;
            }else if(numbers[mid] > key){ // left->end
                return end = mid - 1;
            }else{ //right->start
                start = mid + 1; 
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key =14;
        System.out.println("The index of number is "+binSech(number, key));

    }
}