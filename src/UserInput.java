import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String args[]) throws Exception
	
	{
	//int i=System.in.read();	
	//System.out.println((char)i);
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
str=(br.readLine());
System.out.println(str);
	}

	
	

}
