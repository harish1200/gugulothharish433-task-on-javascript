
public class SpecificOutput {
	public static void main(String args[])
	{
	@SuppressWarnings("unused")
	T obj= new T();
	}

}

class S
{
	public S()
	{
		System.out.println("1");
	}
	public S(int i)
	{
		System.out.println("2");
	}
}

class T extends S
{
	public T()
	{
		System.out.println("3");
	}
	public T(int i)
	{
		System.out.println("5");
	}
}
