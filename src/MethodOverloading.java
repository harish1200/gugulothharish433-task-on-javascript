
public class MethodOverloading {
public static void main(String args[])
{

	new E().Show(1,2);
}
}

class E
{
	public void Show() {
		System.out.println("hello");
	}
	public void Show(int i) {
		System.out.println("hi");
	}
	public void Show(int i,int j) {
		System.out.println("good");
	}
}