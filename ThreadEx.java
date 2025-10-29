class TreadEx3 extends Thread
{
	//String name;
	TreadEx3(String thname)
	{
		super(thname);
	}
	public void run()
	{
		System.out.println("name:"+Thread.currentThread().getName());
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		TreadEx3 obj=new TreadEx3("thread1");
        obj.start();
	}
}