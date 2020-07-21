
public class Abstraction {
public static void main(String args[])
{
Phone p=new Iphone(); 	
p.call();
p.cook();
p.dance();
p.move();
}
}
abstract class Phone
{
	public void call()
	{
		System.out.println("calling...");
		
	}
	public abstract void move();//abstract class
	public abstract void dance();
public abstract void cook();
}

abstract class Samsung extends Phone
{
	public void move()
	{
		System.out.println("moving");
	}
	
}
class Iphone extends Samsung//concrete class
{ 
	public void dance()
	{
		System.out.println("dancing..");
	}
	public void cook()
	{
		System.out.println("cooking");
	}
}
