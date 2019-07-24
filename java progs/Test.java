class Author
{
	String name,email,gender;
	Author(String n,String em,String g)
	{
		name=n;
		email=em;
		gender=g;
	}
	
	void getDetails()
	{
		System.out.println("name of the author is "+name);
		System.out.println("email of the author is "+email);
		System.out.println("gender of the author is "+gender);
	}
}

class Book
{
	private String name;
	private Author author;
	private  double price;
	private int qty ;
	
	Book(String name,Author author,double price)
	{
		this.name=name;
		this.author=author;
		this.price=price;	
	}

	Book(String name,Author author,double price,int qty)
	{
		this.name=name;
		this.author=author;
		this.price=price;	
		this.qty=qty;	
	}
	
	void bookDetails()
	{
		author.getDetails();
		System.out.println("================================");
		System.out.println("Book details");
		System.out.println("name of the book "+name);

		System.out.println("price of the book "+price);
		System.out.println("quantity of the book "+qty);

	}
	
}

class Test
{
	public static void main(String args[])
	{
		Author a1=new Author("Martin","martin@gmail.com","male");

		//Author a1[]=new Author[5];

		Book b1=new Book("hercules",a1,300);
		b1.bookDetails();
		System.out.println();
		Book b2=new Book("Goosebumps",a1,500,2);
		b2.bookDetails();
	}
}