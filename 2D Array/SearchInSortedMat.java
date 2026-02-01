public class SearchInSortedMat {
    public static void search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at index ("+i+","+j+")");
                }else{
                    System.out.println("Not found !");
                }
            }
        }
    }
    public static Boolean staircaseSearch(int matrix[][],int key){
        int row =0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key found at (" + row +","+col+")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }

        }
        System.out.println("Not found given key");
        return false;


    }
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}};
        int key =50;
        staircaseSearch(matrix, key);
    }

}