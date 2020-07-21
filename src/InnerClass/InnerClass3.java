package InnerClass;

public class InnerClass3 {

	public static void main(String args[])
	{
		Phone p=()->System.out.println("i can call,take pics,songs....");//ananoymous Innerclass
		p.show();
	}
}


interface Phone
{
	void show();
}