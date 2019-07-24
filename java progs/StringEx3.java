import java.util.*;
class StringEx3
{
	public static void main(String args[])
	{

	
		String name1="Ali-Al-Ali";
		String name2="Ahmed-Al-Ahmed";
		int x1=name1.lastIndexOf('-');
		int x2=name2.lastIndexOf('-');
		String name3;

		name3=name1.substring(0,x1)+name2.substring(x2,name2.length());
		System.out.println(name3);

		name2=name2.substring(0,x2)+name1.substring(x1,name1.length());
				System.out.println(name2);
	}
}