class StringEx5
{
	public static void main(String args[])
	{
		String s="Java 102 \"Programming Course\"";
		System.out.println(s);
		String arr[]=s.split(" ");
		for(String arr1:arr)
		System.out.println(arr);
	}
}