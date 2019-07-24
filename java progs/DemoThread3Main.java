
class DemoThread1 extends Thread
{
	DemoThread1(String name)
	{
		super(name);
		this.start();
	}
	public void run()
	{
		System.out.println("running child Thread in loop ");
		for(int i=0;i<10;i++)
		{
			System.out.println("counter "+i+" "+this.getName());
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException e){}
		}
	}
		
}

class DemoThread3Main
{
	public static void main(String args[])
	{
		System.out.println("main");
		DemoThread1 d1=new DemoThread1("A");
		DemoThread1 d2=new DemoThread1("B");
		DemoThread1 d3=new DemoThread1("C");
		
	}
}