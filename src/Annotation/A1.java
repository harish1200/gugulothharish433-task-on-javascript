package Annotation;

public class A1 {
public static void main(String args[])
{
	A3 obj=new A3();
	obj.showI();
}
}


//overriding
class A2
{
	public void showI()
	{
		System.out.println("hello");
	}
}

class A3 extends A2
{
	public void show()
	{
		System.out.println("hi");	
	}
}