import java.util.Random;  //using random number to assign objects 
abstract class instrument
{
	abstract void play();
}

class piano extends instrument
{
	void play(){System.out.println("piano is playing tan tan tan");}
}
class flute extends instrument
{
	void play()
	{
		System.out.println("flute is playing toot toot toot");
	}
}
class guitar extends instrument
{
	void play()
	{
		System.out.println("guitar is playing tin tin tin");
	}
}
class instrumentMain
{
	
	public static void main(String args[])
	{	
		instrument []arr=new instrument[10];
		Random ran=new Random();
		int ran1=ran.nextInt(10);
		int ran2=ran.nextInt(10);
		int ran3=ran.nextInt(10);

		arr[ran1]=new piano();
		arr[ran2]=new flute();
		arr[ran3]=new guitar();

		System.out.println(ran1+" "+ran2+" "+ran3);	
		arr[ran1].play();
		arr[ran2].play();	
		arr[ran3].play();
		if(arr[ran1] instanceof piano)
		System.out.println("yes piano "+ran1);	
	
	}
}