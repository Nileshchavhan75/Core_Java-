class Book{
    String title;
    String author;
    double price;


    void displayDetails(){
        System.out.println("TItle: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+price);
    }
}
public class opps1 {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "rich dad poor dad";
        b.author = "RObert";
        b.price = 157.2;

        b.displayDetails();
    }
    
}
