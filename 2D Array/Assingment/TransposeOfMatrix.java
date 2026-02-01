package Assingment;
public class TransposeOfMatrix {
    public static void rowToCol(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        int tranMatrix[][] = new int[col][row];
        for(int i=0;i<matrix.length;i++){ // row of orginal
            for(int j=0;j<matrix[0].length;j++){ //col of orginal
                tranMatrix[j][i] = matrix[i][j];
            }
        }
        // print matrix
        printMat(tranMatrix);
    }
    public static void printMat(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }        
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {11,12,13},
            {21,22,23}
        };
        rowToCol(matrix);
        // printMat(matrix);
    }
}