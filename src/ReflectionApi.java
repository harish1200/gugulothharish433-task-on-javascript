import java.lang.reflect.Method;

public class ReflectionApi {
	public static void main(String args[]) throws Exception ,ClassNotFoundException,NullPointerException
	{
		Class c=Class.forName("akhil");
		Test t =(Test)c.newInstance();
		java.lang.reflect.Method m=c.getDeclaredMethod("show");
		m.setAccessible(true);
		m.invoke(t);
	}
	
}
class Class
{

	public static Class forName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Method getDeclaredMethod(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Test newInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Test
{
	@SuppressWarnings("unused")
	private  void show()
	{
		System.out.println("show");
	}
}
