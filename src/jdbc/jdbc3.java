package jdbc;
public class jdbc3 {
public static void main(String args[])throws Exception
{
	Class.forName("com.mysql.cj.jdbc.Driver");
}
}
class pqr
{
	static 
	{
		System.out.println("in static");
		
	}
	//instance
	{
		System.out.println("in instance");
	}
}

//Class.forName is used to register the DriverManager.registerDriver(""com.mysql.jdbc.Driver);