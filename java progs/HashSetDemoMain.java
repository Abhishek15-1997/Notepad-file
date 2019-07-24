import java.util.*;

class HashSetDemoMain 
{
	
	public static void main(String args[])
	{
		HashSet<String> l=new HashSet<>();
		l.add("E");
		l.add("Z");
		l.add("F");
		l.add("K");
		l.add("A");
		
		System.out.println(l.contains("A"));


		TreeSet<String> ts=new TreeSet<String>(l); 

		Iterator<String> itr=ts.iterator();
		

		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
		System.out.println("descending =================");

			while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}
       	
	}


}