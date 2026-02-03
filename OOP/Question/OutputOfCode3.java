package OOP.Question;

public class OutputOfCode3 {
    public static void main(String[] args) {
        System.out.print(Book.count); // static variable can directly access to the calss
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        Book b3 = new Book(350);
        System.out.println(Book.count);
    }
}
class Book{
    int price;
    static int count;
    
    public Book(int price){
        this.price = price;
        count++;
    }
}