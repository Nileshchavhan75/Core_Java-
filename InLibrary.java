public class InLibrary {
    private String title = "Rich dad poor Dad";
    static private String author = "Robert";

    class Book{
        public void displayBookDetails(){
            System.out.println(title);
            System.out.println(author);

        }
        static class Author{
            static void showAuthorName(){
                System.out.println(author);
            }
        }

    }
    public static void main(String[] args) {
        InLibrary l = new InLibrary();
        InLibrary.Book b = l.new Book();
        b.displayBookDetails();

        InLibrary.Book.Author a = new InLibrary.Book.Author();
        a.showAuthorName();

    }
}
