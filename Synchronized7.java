class Bookseat{
    int total_seat = 10;
    public void Bookseats(int seats){
        synchronized(this){
            if( seats < 0){
                System.out.println("Please Enter valid Number: ");
            }
            if(seats<total_seat){
                System.out.println(seats+" :Booked succesfully");
                total_seat -= seats;
                System.out.println("Remaining seats: "+ total_seat);
            }else{
                System.out.println("You can not booked seats more than: "+ total_seat);
            }
        }
    }
}
public class Synchronized7 extends Thread{
    Bookseat b;
    int seats;
    Synchronized7(Bookseat b, int seats){
        this.b = b;
        this.seats = seats;
    }
    public void run(){
        b.Bookseats(seats);
    }
    public static void main(String[] args) {
        Bookseat b = new Bookseat();
        Synchronized7 s1 = new Synchronized7(b, 6);
        Synchronized7 s2 = new Synchronized7(b, 3);
        s1.start();
        s2.start();

        
    }
}
