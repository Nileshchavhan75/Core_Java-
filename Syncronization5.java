class Bookseats{
    int total_seats = 10;
    public void bookTicket(int seat){
        synchronized(this){
            if(seat <=0){
                System.out.println("Please Valid seat number: ");
                return;
            }
            if(seat<=total_seats){
                System.out.println(seat+" :seats booked Successfully");
                total_seats = total_seats - seat;
                System.out.println("Remaining seats: "+total_seats);
            }else{
                System.out.println("Only Seats available: "+ total_seats);
            }

        }
    }
}
public class Syncronization5 extends Thread {
    Bookseats b;
    int seats;

    Syncronization5(Bookseats b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.bookTicket(seats);
    }
    public static void main(String[] args) {
        Bookseats b = new Bookseats();
        Syncronization5 s = new Syncronization5(b,6);
        s.start();
        try{
            s.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        Syncronization5 s1 = new Syncronization5(b, 5);
        s1.start();
    }
}
