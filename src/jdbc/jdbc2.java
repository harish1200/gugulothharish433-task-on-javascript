
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class jdbc2 {
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
 int update=st.executeUpdate("insert into abc.customer values ('4', 'dinesh', 'mainsh', 'dpg', 'mulugu', '5034', 'paris')");
 System.out.println(update + "rows effected");
	st.close();
	con.close();	
}
catch (Exception e)
{
	System.out.println(e);
	
}
}
}