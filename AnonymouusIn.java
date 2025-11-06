public class AnonymouusIn {
    public void display(){
         Runnable r = new Runnable() {
            public void run(){
                System.out.println("this the massage in innonymouus class: ");
            }
         };
         Thread t = new Thread(r);
         t.start();
    }
    public static void main(String[] args) {
        AnonymouusIn i = new AnonymouusIn();
        i.display();
    }
}

