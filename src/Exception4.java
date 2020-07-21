import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception4 {
	public static void main(String args[]) throws NumberFormatException, IOException
	{
	int i,j,k = 0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	i=8;
	
	try
	{System.out.println("enter a number");
		j=Integer.parseInt(br.readLine());
	k=i/j;
	System.out.println(k);
	System.out.println("bye");//prints after every successful exection
	}
	catch (ArithmeticException e)
	{
		System.out.println("divvide by 0" + e);
	}
finally
{
	
System.out.println("bye");//prints after completion a execution
}
		
	}
}
