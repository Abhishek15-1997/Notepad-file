import java.util.*;

class Rectangle
{
	double length,breadth;
	Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
		System.out.println("Length: "+length+"\n"+"Heigth: "+breadth);
	}
	
	void perimeter(){ System.out.println("Perimeter is "+2*(length+breadth));}
	void area(){System.out.println("area is "+length*breadth);}
}

class RectangleMain
{
	public static void main(String args[])
	{
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		try{
		l=sc.nextDouble();

		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Something went wrong");
			l=0.00;
			
		}
	
		sc=new Scanner(System.in);
		System.out.println("enter the height");
		 b=sc.nextDouble();
		
		System.out.println("Rectangle Characteristics");
		Rectangle r=new Rectangle(l,b);		
		r.perimeter();
		r.area();
	}
}