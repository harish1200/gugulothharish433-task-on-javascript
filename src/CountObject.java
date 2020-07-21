
public class CountObject {
@SuppressWarnings("unused")
public static void main(String args[])
{
	Abc obj1=new Abc();
	Abc obj2=new Abc();
	Abc obj3=new Abc();
	Abc obj4=new Abc();
	
}
}

class Abc
{
	static int i;
	public void A()
	{
		i++;
		System.out.println(i);
	}
public void Count()
{
	System.out.println(i);
}
}
