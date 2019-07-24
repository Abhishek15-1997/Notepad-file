class ArrayProgMain
{
	public static void main(String args[])
	{
		int  x;
		int arr[]=new int[args.length];		
		for(int i=0;i<args.length;i++)
		{
			x=Integer.parseInt(args[i]);
			arr[i]=x;	
		}

	//sorting
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{	
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++)
		System.out.println("no "+i+" "+arr[i]);
		
		
	}
}