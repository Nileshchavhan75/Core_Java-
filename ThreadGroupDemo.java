class MyThreadGP extends Thread
{
	MyThreadGP (String threadname, ThreadGroup thgrp)
	{
	super(thgrp, threadname);
	start();
	}

	public void run()
	{
	System.out.println(Thread.currentThread().getName()+"   thread is running");
	}
}
public class ThreadGroupDemo
{
public static void main(String args[])
{
ThreadGroup grp = new ThreadGroup ("parent-thread");

MyThreadGP t1 = new MyThreadGP ("first", grp);

MyThreadGP t2 = new MyThreadGP ("second", grp);
System.out.println("Number of active threads running in thread group: "
+ grp.activeCount());
}
}
