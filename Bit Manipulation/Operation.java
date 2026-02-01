public class Operation {

    public static int getIthBit(int n,int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask = 1 << i;
        return bitMask | n;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){
        // // method-1
        // if(newBit == 0 ){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }

        // method-2:
        n = clearIthBit(n, i); // already removed ith bit
        int bitMask = newBit << i;
        return n | bitMask;
    }
    // Clear Last Ith Bit
    public static int clearLastIthBit(int n,int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // Clear Range Of Bits
    public static int  clearBitInRange(int n , int i,int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    
    public static void main(String[] args) {
        // System.out.println(getIthBit(5,0));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 0, 1));
        // System.out.println(updateIthBit(10, 1, 0));
        // System.out.println(clearLastIthBit(15, 2));
        System.out.println(clearBitInRange(10,2 , 4));


    }
    
}