import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//throws :we dont need try,catch if u write throws at main including type of excpetion
public class Exception6 {
public static void main(String args[]) throws NumberFormatException, IOException
{int i=8,j,k;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("enter a number");
	j=Integer.parseInt(br.readLine());
k=i/j;
System.out.println(k);


}



}
