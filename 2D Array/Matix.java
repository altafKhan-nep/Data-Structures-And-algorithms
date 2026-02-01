import java.util.Scanner;

public class Matix {

    public static Boolean isFound(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Matrix is found at a cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not found ");
        return false;
    }
    // largest and smallest elemen in matrix
    public static void size(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest = Math.max(matrix[i][j],largest);
                smallest = Math.min(matrix[i][j],smallest);
            }
        }
        System.out.println("Largest element is "+largest);
        System.out.println("Smallest element is "+smallest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        //Taking input (n x m ) matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // showing output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        isFound(matrix, 5);
        size(matrix);
    }

}