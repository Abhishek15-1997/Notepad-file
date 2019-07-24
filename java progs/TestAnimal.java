interface Pet
{
	String getName();
	void setName();
	void play();
}
abstract class Animal
{
	protected int legs;
	
	protected Animal(int legs)
	{	
		this.legs=legs;
	}
	abstract void eat();
	void walk()
	{
		System.out.println("Animals can walk "+legs);
	}
}

class Cat extends Animal implements Pet
{
	String name;
	Cat(String name)
	{
		super(4);
		this.name=name;	
	}
	Cat()
	{
		this(" ");
	}
	
	public String getName()
	{
		return name;	
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void play()
	{
		System.out.println("cat is playing");
	}

	void eat()
	{
		System.out.println("Cat eats");
	}
}

class Fish extends Animal
{
	Fish()
	{
		super(0);
	}
	void walk()
	{
		System.out.println("fish cannot walk");
	}

	void eat()
	{
		System.out.println("fish eats");
	}
}
class Spider extends Animal 
{
	Spider()
	{
		super(8);
	}
	
	void eat()
	{
		System.out.println("spider eats ants");
	}
}

class TestAnimals
{
	public static void main(String args[])
	{
		Fish d=new Fish();
		
		Cat c=new Cat();
		c.eat();

		Cat c=new Cat("Fluffy");
		System.out.println(c.getName());
		c.play();

		Animal a=new Fish();
		a.walk();
		a.eat();

		Animal e=new Spider();
		e.eat();

		Pet p=new Cat();
		System.out.println(p.getName());
		p.play();
		p.walk();
	}
}