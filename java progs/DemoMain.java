import java.util.*;
class Employees implements Comparable<Employees>
{
	int id;
	String name;
	Employees(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	
	public int compareTo(Employees e)
	{
		String name1=e.name;
		return name.compareTo(name1);
	}
	public String toString()
	{
		return name+" "+id;	
	}
}

class DemoMain
{
	public static void main(String args[])
	{
		LinkedList<Employees> l=new LinkedList<>();
		l.add(new Employees("Abhishek",22));
		l.add(new Employees("Anurag",20));
		l.add(new Employees("Bobby",28));
		l.add(new Employees("Raman",34));
		l.add(new Employees("Ashish",40));

		Collections.sort(l);

		Iterator itr=l.iterator();

		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}

		
	}
}