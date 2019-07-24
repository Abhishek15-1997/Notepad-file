class Book
{
	int bookIsbn;
	String bookTitle;
	String authorName;
	int price;

	void initBookDetails(int b,String bt,String a_name,int p)
	{
		bookIsbn=b;
		bookTitle=bt;
		authorName=a_name;
		price=p;
	}

	void printDetails()
	{
		System.out.println(bookIsbn+" "+bookTitle+" "+authorName+" "+price);
	}

	int discountGiven(int disc)
	{
		price=price-disc;
		return price;
	}
}

class bookMain
{
	public static void main(String args[])
	{
		Book b1=new Book();
		
		b1.initBookDetails(1000,"harry potter","james",2000);
		b1.printDetails();
		System.out.println("price after discount "+b1.discountGiven(25));

		Book b2=new Book();		

		b2.initBookDetails(1100,"Goosebumps","tom",500);
		b2.printDetails();
		System.out.println("price after discount "+b2.discountGiven(15));	


	}
}