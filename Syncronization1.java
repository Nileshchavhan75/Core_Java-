class Bookseats{
    int total_seats = 10;
    public void Bookseatss(int seats){
        synchronized (this) {
        if(seats <= total_seats){
            System.out.println(seats + " seats booked succesfully: ");
            total_seats = total_seats - seats;
            System.out.println("Remaing seats: "+total_seats);
        }else{
            System.out.println("you can not Booked seats more than 10 at time: ");
        }
     }
   }
}
public class Syncronization1 extends Thread {
    Bookseats b;
    int seat;
    Syncronization1(Bookseats b, int seat){
        this.b = b;
        this.seat = seat;
    }
    public void run(){
        b.Bookseatss(seat);
    }
    public static void main(String[] args) {
        Bookseats b = new Bookseats();
        Syncronization1 s1 = new Syncronization1(b, 7);
        s1.start();
        Syncronization1 s2 = new Syncronization1(b, 2);
        s2.start();

    }
}
