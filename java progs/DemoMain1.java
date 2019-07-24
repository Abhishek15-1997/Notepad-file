import java.util.*;
class Employees 
{
	int id;
	String name;
	Employees(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return name+" "+id;	
	}
}

class Sorting implements Comparator<Employees>
{
	
	public int compare(Employees e1,Employees e2)
	{
		String name2=e2.name;
		String name1=e1.name;
		return name1.compareTo(name2);
	}
}

class DemoMain1
{
	public static void main(String args[])
	{
		LinkedList<Employees> l=new LinkedList<>();
		Sorting s=new Sorting();
		l.add(new Employees("Abhishek",22));
		l.add(new Employees("Anurag",20));
		l.add(new Employees("Bobby",28));
		l.add(new Employees("Raman",34));
		l.add(new Employees("Ashish",40));

		Collections.sort(l,s);

		Iterator itr=l.iterator();

		while(itr.hasNext())
		{	
			System.out.println(itr.next());
		}

		
	}
}