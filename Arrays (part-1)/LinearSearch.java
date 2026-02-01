public class LinearSearch {

    public static int Search(int numbers[],int key){
        // linear search
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    // string menu
    public static int foodList(String menu[],String stKey){
        for(int i =0;i<menu.length;i++){
            if(menu[i].equals(stKey)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // number case
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int numIndex = Search(numbers, key);
        if(numIndex == -1){
            System.out.println("Not Found!");
        }else{
            System.out.println("String is at index:  "+numIndex);
        }

        // String case
        String menu[] = {"biryani","samosha","chicken korma"};
        String stKey = "samosha";

        int index = foodList(menu, stKey);
        
        if(index == -1){
        System.out.println("Not Found!");
        }else{
            System.out.println("String is at index:  "+index);
        }
    }
}