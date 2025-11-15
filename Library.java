
public class Library {

    public void addBook(String name, String author){
        class Book{
            void display(){
                System.out.println("Book Name: "+name);
                System.out.println("Author Name: "+author);
            }
        }
        Book b = new Book();
        b.display();
    }
    public static void main(String[] args) {
        Library b = new Library();
        b.addBook("Rich", "robert");

    }

}
