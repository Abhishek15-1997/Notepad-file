import java.util.*;
class StringEx4
{
	public static void main(String args[])
	{

		String s="I'm a JaVa PrOgRaMmEr";
		StringBuffer s2=new StringBuffer("");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='m'||s.charAt(i)=='M')
			{
				continue;		
			}
			s2.append(s.charAt(i));
		}
		
		System.out.println(s2);

	}
}