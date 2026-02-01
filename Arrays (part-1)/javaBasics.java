public class javaBasics {

    public static void update(int marks[],int unChangeble){
        unChangeble = 35;
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int unChangeble = 15;
        update(marks,unChangeble);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println(unChangeble);
    }
}