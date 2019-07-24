import java.util.Random;
class genRandom
{
	Random rand;
	boolean flag;
	int r;
	int fact;

	genRandom()
	{
	fact=1;
	flag=false;
	}

	synchronized void getRandom()
	{	

		if(flag==true)
		{
		       try{
			wait();
			}
			
			catch(Exception e)
			{System.out.println(e);}
		}
			rand=new Random();
			r=rand.nextInt(10);
			System.out.println("Random Number : "+r);	
		   	flag=true;
		notify();
		
	}	
	
	synchronized void genfacto()
	{

		if(flag==false)
		{   
			try{
			wait();
			}

			catch(Exception e){System.out.println(e);}
		}

			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
		    	System.out.println("Factorial Number : "+fact);
		
		flag=true;
		notify();
	}	
}

class Thread1 extends Thread
{
	genRandom g;
	Thread1(genRandom g)
	{
		this.g=g;
	}
	public void run()
	{

		g.getRandom();

	}
}
class Thread2 extends Thread
{
	genRandom g;
	Thread2(genRandom g)
	{
		this.g=g;
	}
	public void run()
	{
				
		g.genfacto();
		
	}
}
class randomMain
{
	public static void main(String args[])
	{
		genRandom g=new genRandom();
		Thread1 t1=new Thread1(g);
		Thread2 t2=new Thread2(g);
		t1.start();
		t2.start();
		
	}
}


