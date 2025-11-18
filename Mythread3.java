class Mythread3 extends Thread{
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
	Mythread3 m1 = new Mythread3();
	Mythread3 m2 = new Mythread3();
	Mythread3 m3 = new Mythread3();
	m1.setName("Thread 1 :");
	m2.setName("Thread 2: ");
	m3.setName("Thread 3: ");
	m1.start();
    m2.start();
	m3.start();
}
}
