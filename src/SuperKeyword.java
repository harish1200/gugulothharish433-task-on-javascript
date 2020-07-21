// if we dont initialze super keyword M() will be diplayed
public class SuperKeyword {
	public static void main(String args[])
	{
	@SuppressWarnings("unused")
	M obj= new N(5);
	}

}

class M
{
	public M()
	{
		System.out.println("1");
	}
	public M(int i)
	{
		System.out.println("2");
	}
}

class N extends M
{
	public N()
	{
		System.out.println("3");
	}
	public N(int i)
	{
		super(i);
		System.out.println("5");
	}

}
