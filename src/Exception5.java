import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception5 {
//try with resource java 1.7
	public static void main(String args[]) throws IOException
	{ 
	
	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in)))//catch not needed in this case
	{@SuppressWarnings("unused")
	String str="";
		
	str=br.readLine();
	}
	

	finally {
		System.out.println("bye");
	
	}
	}
}
