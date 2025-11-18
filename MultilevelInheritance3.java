import javax.print.DocFlavor.STRING;

class Library{
    String Library_name;
    String Location;

    public Library(String Library_name, String Location){
        this.Library_name = Library_name;
        this.Location = Location;
    }

    public void displayLibrary(){
        System.out.println("Library Name: "+ Library_name);
        System.out.println("Location: "+Location);
    }
}
class Book extends Library{
    String title;
    String author;
    int ISBN_number;

    public Book(String Library_name, String Location,String title,String author, int ISBN_number ){
        super(Library_name, Location);
        this.title = title;
        this.author = author;
        this.ISBN_number = ISBN_number;
    }
    public void displayBook(){
        displayLibrary();
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN_ Number: "+ISBN_number);
    }
}
class IssuedBook extends Book{
  String issue_date;
  String return_date;

  public IssuedBook(String Library_name, String Location,String title,String author, int ISBN_number, String issue_date, String return_date){
        super(Library_name, Location, title, author, ISBN_number);
        this.issue_date = issue_date;
        this.return_date = return_date;
  }
  public void displayIssuedBook(){
    displayBook();
    System.out.println("Issue Date: "+ issue_date);
    System.out.println("Return Date: "+ return_date);
  }

}



public class MultilevelInheritance3 {
    public static void main(String[] args) {
    IssuedBook i = new IssuedBook("Swami vivekand", "Jalgoan near mj college", "Rich dad poor dad", "Robert kavasaki", 123, "12/10/24", "30/10/2024");
    i.displayIssuedBook();
    }
    
    
}
