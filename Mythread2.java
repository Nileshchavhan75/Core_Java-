class Mythread2 implements Runnable{
	public void run(){
	for(int i = 1; i<=5; i++){
	System.out.println(i);
}
}
public static void main(String args[]){
	Mythread2 m1 = new Mythread2();
	Thread t1 = new Thread(m1);
	t1.start();
}
}

