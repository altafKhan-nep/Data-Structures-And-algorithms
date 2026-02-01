public class StudentStatus {

    public static void main(String[] args) {
        float marks = 30;
        if(marks >= 33){
            System.out.println("You are pass!");
        }else{
            System.out.println("Student is fail");
        }
        // ternary operator
        String status = (marks >= 33) ? "Pass":"Fail";
        System.out.println(status);
    }
}