import java.util.*;
import java.lang.*;
class StringEx1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String s=sc.next();
		int len=s.length();
		System.out.println(len);
     	  	String s1=(s.substring(0,len/2)).toUpperCase()+s.substring(len/2);
		System.out.println(s1);

	}
}


