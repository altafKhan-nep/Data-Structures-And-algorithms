public class PrintHollowRect {

    public static void patterns(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i == 1 || i == 4 || j == 1 || j == 5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        patterns(4,5);
        
    }
}