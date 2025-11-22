class PriorityThread extends Thread
{
	String name;
	PriorityThread(String thname)
	{
		super(thname);
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+"  having priority ::"+Thread.currentThread().getPriority());
	}
	public static void main(String [] args)
	{
		PriorityThread t1=new PriorityThread("thread1"); 
		PriorityThread t2=new PriorityThread("thread2"); 
		PriorityThread t3=new PriorityThread("thread3"); 
		PriorityThread t4=new PriorityThread("thread4"); 
		PriorityThread t5=new PriorityThread("thread5"); 
		t1.setPriority(5);
		t2.setPriority(10);
		t3.setPriority(1);
		t4.setPriority(2);
		t5.setPriority(4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}