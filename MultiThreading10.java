class num extends Thread
{
	public void run()
	{
	  try
	   {
		System.out.println("name of current thead:"+Thread.currentThread().getName());
		System.out.println("1 to 10 numbers:");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		 sleep(800);
	    }
	  catch(InterruptedException e)
	    {
		System.out.println(e);
	    }
	}
}
class sqThread extends Thread
{
	public void run()
	{
		System.out.println("name of current thead:"+Thread.currentThread().getName());	
		System.out.println("sq from 1 to 10:");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i*i);
		}
	}
}
public class MultiThreading10
{
	public static void main(String [] args)
	{
		num t1=new num();
		sqThread t2=new sqThread();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		System.out.println("checking if t1 thraed is Alive :"+t1.isAlive());
		System.out.println("checking if t2 thraed is Alive :"+t2.isAlive());
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t2.start();
		System.out.println("checking if t2 thraed is Alive :"+t2.isAlive());
		System.out.println("name of current thead:"+Thread.currentThread().getName());
	}
}