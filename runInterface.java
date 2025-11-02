class runInterface implements Runnable
{
	String name;
	Thread t;
	runInterface(String thname)
	{
		t=new Thread(this,thname);
		t.start();
		
	}
	public void run()
	{
		System.out.println("Runnable interface "+Thread.currentThread().getName());
	}
	public static void main(String [] args)
	{
		runInterface t1=new runInterface("thread1");
		runInterface t2=new runInterface("thread2");
		runInterface t3=new runInterface("thread3");
		try {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
		
	}
}