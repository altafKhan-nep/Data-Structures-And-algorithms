package Strings;

class ShortestPath {

    public static float getShortPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            // North
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int Xsq = x*x - 0;
        int Ysq = y*y - 0;
        return (float) Math.sqrt(Xsq+Ysq);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortPath(path));
    }
    
}