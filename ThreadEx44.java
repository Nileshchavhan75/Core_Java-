//Define three threads as separate classes or by using the Runnable interface.
//Implement the respective tasks (sum, factorial, squares) in the run() method of each thread.
//Use the join() method in the main() method to control the execution order*/


class sum implements Runnable
{	public void run()
	{
	int sum=0;
	for(int i=1;i<=10;i++)
	{
		sum+=i;
	}
	System.out.println("sum of 1st 10 numbers is:"+sum);
	}
}
class factorial implements Runnable
{	public void run()
	{
	int fact=1;
	for(int i=1;i<5;i++)
	{
		fact=fact*i;
	}
	System.out.println("factirial:"+fact);
	}
}
class squares implements Runnable
{	public void run()
	{
	System.out.println("squares");
	for(int i=1;i<=10;i++)
	{
		System.out.println(i*i);
	}
	}
}
public class ThreadEx44
{
	public static void main(String args[])
	{
		sum t1=new sum();
		factorial t2=new factorial();	
		squares t3=new squares();
		Thread t4=new Thread(t1);
		Thread t5=new Thread(t2);
		Thread t6=new Thread(t3);
		t4.start();
		try
		{
			t4.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t5.start();
		try
		{
			t5.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t6.start();	
	}	
}