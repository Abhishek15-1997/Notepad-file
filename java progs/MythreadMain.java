
import java.time.LocalTime;
class MythreadMain extends Thread
{
		
	
	public static void main(String args[])
	{
		
		Thread t1=Thread.currentThread();
		t1.setName("MyThread");
		System.out.println(t1.getName());

		LocalTime t=LocalTime.now();
		int hr=t.getHour();
		int min=t.getMinute();
		int sec=t.getSecond();

		System.out.printf("%d:%d:%d",hr,min,sec);
		try{
		t1.sleep(1000);
		}
		catch(InterruptedException e){}
		System.out.println();
		t=LocalTime.now();
		hr=t.getHour();
		min=t.getMinute();
		sec=t.getSecond();
		System.out.printf("%d:%d:%d",hr,min,sec);
		

	}

	
		
	
}