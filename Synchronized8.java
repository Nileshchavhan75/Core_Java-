class Bookseat{
    int total_seat = 10;
    public synchronized void bookTicket(int seat){
        if(seat < 0){
            System.out.println("Please a Enter valid seat number: ");
            return;
        }
        if(seat<total_seat){
            System.out.println(seat+ ": Booked succesffully");
            total_seat -= seat;
            System.out.println("Remaining seats: "+ total_seat);
        }else{
            System.out.println("You can not book: "+seat+ " Only seats available : "+ total_seat);
        }
    }
}
public class Synchronized8 extends Thread{
    Bookseat b; 
    int seat;
    Synchronized8(Bookseat b, int seat){
        this.b = b;
        this.seat = seat;
    }
    public void run(){
        b.bookTicket(seat);
    }
    public static void main(String[] args) {
        Bookseat b = new Bookseat();
        Synchronized8 s1 = new Synchronized8(b, 4);
        Synchronized8 s2 = new Synchronized8(b, 5);
        s1.start();
        try{
            s1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        s2.start();
        
    }
}
