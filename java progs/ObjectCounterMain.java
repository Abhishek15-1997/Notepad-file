class ObjectCounter
{
	static int count;
	ObjectCounter()
	{
		count+=1;
	}
	static int getObjectCount()
	{
		return count;
	}
}

class ObjectCounterMain
{
	public static void main(String args[])
	{
		System.out.println(ObjectCounter.getObjectCount());	
		new ObjectCounter();	
		System.out.println(ObjectCounter.getObjectCount());		
		
	}
}