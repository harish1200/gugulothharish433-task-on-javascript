
public class Constructer {
@SuppressWarnings("unused")
public static void main(String args[])
{
	A obj=new A(5,5.5f);
	
}
}
class A
{
	int i;
	float j;
	double k;
	public A()
	{
		i=5;
		j=5.5f;
		System.out.println("hello");
		
	}
	public A(int i,float j,double k)
	{
		System.out.println("hi");
	}
	public A(int i,float j)
	{
		System.out.println("welcome");
	}
}