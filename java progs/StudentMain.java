/*
1.create a user defined exception class which is named as OutOfRangeException
2.create a class student which is having instance variable name,mark1,mark2,mark3
3.create 1 parameterized constructor and the method which prints the average marks of stud1  is 85
4.write a main class which takes name and marks from the commandline arguments and call the avg methods.... Handle all the exceptions*/

import java.util.*;
import java.io.*;
class OutOfRangeException extends Exception
{
	public String toString()
	{
		return "range should be between 0-100 ";
	}
}
class Student
{
	String name;
	int m1,m2,m3;
	Student(String name,int m1,int m2,int m3) throws OutOfRangeException 
	{
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		if(this.m1<0 || this.m1>100 || this.m2<0 || this.m2>100 ||this.m3<0 || this.m3>100)
		throw new OutOfRangeException();
	}

	void printAvgMarks()
	{
		System.out.println("average marks of "+name+" is "+(m1+m2+m3)/3);
	}
	
} 


class StudentMain{
	public static void main(String args[])
	{
		int m1=0;
		int m2=0;
		int m3=0;
		String name=args[0];
		Student s;
		try{
		 m1=Integer.parseInt(args[1]);
		
		 m2=Integer.parseInt(args[2]);
		 m3=Integer.parseInt(args[3]);
		try{
		if(args.length>4)
		
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e); 
			System.exit(0);}

		 s=new Student(name,m1,m2,m3);
			s.printAvgMarks();
		
		}
		catch(NumberFormatException e)
		{
			System.out.println("please enter corrent number "+e);
		}
		
		catch(OutOfRangeException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{System.out.println("last exception ");}
		

		

	}
}	
