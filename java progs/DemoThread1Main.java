
class DemoThread1 implements Runnable
{
	public void run()
	{
		System.out.println("running child Thread in loop ");
		for(int i=0;i<10;i++)
		{
			System.out.println("counter "+i+" "+Thread.currentThread().getName());
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException e){}
		}
	}

	DemoThread1()
	{
		new Thread(this).start();
		
	}

	
}

class DemoThread1Main
{
	public static void main(String args[])
	{
		System.out.println("main");
		DemoThread1 d1=new DemoThread1();
		DemoThread1 d2=new DemoThread1();
		DemoThread1 d3=new DemoThread1();
	
	}
}