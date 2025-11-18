public class MultiPriority extends Thread {
        String name;
        MultiPriority(String tname){
            super(tname);
        }
        public void run(){
         System.out.println(Thread.currentThread().getName() + " With priority: "+ currentThread().getPriority());
        }

      public static void main(String[] args) {
        MultiPriority m1 = new MultiPriority("Thread 1 ");
        MultiPriority m2 = new MultiPriority("Thread 2 ");
        MultiPriority m3 = new MultiPriority("Thread 3");
        MultiPriority m4 = new MultiPriority("Thread 4 ");

        m1.setPriority(MAX_PRIORITY);
        m2.setPriority(MIN_PRIORITY);
        m3.setPriority(NORM_PRIORITY);
        m4.setPriority(NORM_PRIORITY);

        m1.start();
        m2.start();
        m3.start();
        m4.start();

      }
}

     

