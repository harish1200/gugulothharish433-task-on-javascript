package InnerClass;

/*
 * 1.member/non-static
 * 2.static
 * 3.anonymous
 */

public class InnerClass1 {

	public static void main(String args[])
	{
		
		//non static
		IC1 obj=new IC1();
		obj.i=5;
		System.out.println(obj.i);
		
		IC1.IC2 obj1=obj.new IC2();
		obj1.j=6;
		System.out.println(obj1.j);
	}
}
class IC1
{
	int i;
	class IC2
	{
		int j;
	}
}
		