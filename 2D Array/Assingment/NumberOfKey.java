package Assingment;
public class NumberOfKey{
    // brute force

    public static void noOfkeys(int matrix[][],int key){
        int countOf7 = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key == matrix[i][j]){
                    countOf7++;
                }
            }
        }
        System.out.println("The key "+key+" occur "+countOf7+" times!");

    }

    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        int key =7;
        noOfkeys(matrix, key);
    }
}