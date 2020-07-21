
public class Inheritence {

	public static void main(String arg[])
	{
		 Div obj=new Div();
		 obj.n1=20;
		 obj.n2=5;
		 obj.mul();
		 System.out.println(obj.res);
	}
}
class Sum
{ int n1,n2,res;
	public void add()
	
	{
		res=n1+n2;
	}
}

class Sub extends Sum
{ 
	public void sub()
	
	{
		res=n1-n2;
	}
}
class Mul extends Sub
{ 
	public void mul()
	
	{
		res=n1*n2;
	}
}

class Div extends Mul
{ 
	public void div()
	
	{
		res=n1/n2;
	}
}