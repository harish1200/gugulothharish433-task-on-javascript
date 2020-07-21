
public class StaticDemo {

public static void main(String args[])
{
Abcde.show();
	
}
}
class Abcde
{
	static int i;
	static float j;
	double k;
	public static void show()
	{
		i=5;
		j=5.5f;
		System.out.println("hello");
		
	}
	public static void show(int i,float j,double k)
	{
		System.out.println("hi");
	}
	public static void show(int i,float j)
	{
		System.out.println("welcome");
	}
}
