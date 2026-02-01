public class InvRotPyramid {
    
    public static void Patterns(int totRows){
        // outer loop for lines
        for(int i=1; i<=totRows; i++ ){
            // for spaces 
            for(int j=1; j<=totRows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Patterns(4);
        
    }
} 