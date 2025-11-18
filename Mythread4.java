class Mythread4 extends Thread{
	Mythread4(String name){
		super(name);
	}
	public void run(){

	try{
	for(int i =1; i<=5; i++){
	System.out.println(Thread.currentThread().getName() + i);
	sleep(300);
	}
	}catch(InterruptedException e){
	System.out.println(e);
}
}

public static void main(String args[]){
	Mythread4 m1 = new Mythread4("Nilesh");
	Mythread4 m2 = new Mythread4("Shivay");
	Mythread4 m3 = new Mythread4("Rutuja");
	
	System.out.println("Thread 1 start from here: ");
	m1.start();
	try{
	m1.join();
	}catch(InterruptedException e){
	System.out.println(e);
	}
	System.out.println("_____________________________________________");

        m2.start();
	System.out.println("Thread 2 start from here: ");

	try{

	m2.join();
	
	}catch(InterruptedException e){
	     System.out.println(e);
	}
 	System.out.println("_____________________________________________");


        m3.start();
}
}
