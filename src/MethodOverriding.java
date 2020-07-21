
public class MethodOverriding {
	public static void main(String args[])
	{
	
		new G().Show();
	}
	}

	class H
	{
		public void Show() {
			System.out.println("hello");
		}
		
}
	class F extends H
	{
	public void Show() {
		System.out.println("hi");
	}
	
	}
	class G extends F
	{
	public void Show() {
		System.out.println("good");
	}
}
	