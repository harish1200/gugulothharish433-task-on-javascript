package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc1 {
	public static void main(String args[])
	
	{
		//String url="jdbc:mysql://localhost:3306/aliens";
		//String uname="root";
		//String pass="";
		//String query="select username from student where id=3";
	try
	{
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "15036244");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from abc.customer ");
	while(rs.next())
		System.out.println(rs.getInt(1) + " " + rs.getString(2)  + " " + rs.getString(3)+ " " + rs.getString(4) + " " 
	+ rs.getString(5) + " " + rs.getInt(6) + " " + rs.getString(7));
	
	st.close();
	con.close();	
}
catch (Exception e)
{
	System.out.println(e);
	
}
}
}