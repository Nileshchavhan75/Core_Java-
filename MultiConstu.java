public class MultiConstu extends Thread {
        String name;
        
        MultiConstu(String thname){
            name = thname;
        }
        public void run(){
            for(int i =1; i<=5; i++){
                System.out.println(name + " count: "+ i);
            }
        }
        public static void main(String[] args) {
             MultiConstu m1 =new MultiConstu(" Shivay: ");
             MultiConstu m2 = new MultiConstu(" Nilesh: ");
            m1.start();
            try {
                m1.join();
            } catch (Exception e) {
                System.out.println(e);
            }
             m2.start();
             try{
                m2.join();
             }catch(Exception e){
                System.out.println(e);
           
            }   
        }
}
