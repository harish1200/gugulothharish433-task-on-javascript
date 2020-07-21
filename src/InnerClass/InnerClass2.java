package InnerClass;

public class InnerClass2 {
	public static void main(String args[])
	{
		
		//static
		
		IC3.i=5;
		System.out.println(IC3.i);
		
		IC3.IC4 obj1=new IC3.IC4();
		obj1.j=6;
		System.out.println(obj1.j);
	}
}
class IC3
{
	static int i;
	static class IC4
	{
		int j;
	}
}
