public class Book {
    String title;
    double price;

    Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {
        Book b = new Book("Rich dad poor dad", 180.0);
        Book b2 = new Book("can we be stranger again", 120.0);

        b.display();
        System.out.println("-----------------------------");
        b2.display();
    }
}
