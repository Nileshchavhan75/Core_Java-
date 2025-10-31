class BookTickets{
    int total_seats = 10;
    public void Bookseats(int seat){
        synchronized(this){
        if(seat<=total_seats){
            System.out.println(seat+" :seats bookes successfully");
            total_seats -= seat;
            System.out.println("Remaining seats: "+ total_seats);
        }else{
            System.out.println("You can book seats more than: "+total_seats+ " only seats are available");
        }
    }
    }
}
public class Syncronization7 extends Thread{
    BookTickets b;
    int seat;
    Syncronization7 (BookTickets b,int seat ){
        this.b = b;
        this.seat = seat;
    }
    public void run(){
        b.Bookseats(seat);
    }
    public static void main(String[] args) {
        BookTickets b = new BookTickets();
        Syncronization7 s = new Syncronization7(b, 5);
        s.start();
        Syncronization7 s2 = new Syncronization7(b, 4);
        s2.start();

        
    }
}
