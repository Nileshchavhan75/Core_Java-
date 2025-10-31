class Bookseats{
    int total_seats = 10;
    public synchronized void bookTicket(int seats){
        if(seats <= 0){
            System.out.println("Please Enter Number to book Seats");
            return;
        }
        if(seats <= total_seats){
            System.out.println(seats+ " :seats book Successfully");
            total_seats = total_seats - seats;
            System.out.println("remaining seats available: "+ total_seats);
        }else{
            System.out.println("only seats are available: "+total_seats + ": You can not book seats more than Available : "+seats);
        }

    }
}
public class Syncronization6 extends Thread {
    Bookseats b;
    int seats;
    Syncronization6(Bookseats b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookTicket(seats);
    }
    public static void main(String[] args) {
        Bookseats b = new Bookseats();
        Syncronization6 s = new Syncronization6(b, 6);
        Syncronization6 s2 = new Syncronization6(b, 2);
        s.start();
        try{
            s.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        s2.start();
    }
}
