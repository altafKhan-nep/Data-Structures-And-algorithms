public class FuncOverloadUsingParams {

    public static int sum(int a,int b){
            return a + b;
        }
    public static float sum(int a,int b,int c){
        return a+b+c;
    }

    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        // System.out.println(sum(2,3));
        // System.out.println(sum(1,2,3));

        System.out.println(sum(2,4));
        System.out.println(sum(1.2f,4.8f));
        
    }
}