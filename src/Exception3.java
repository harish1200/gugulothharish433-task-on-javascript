import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception3 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		int i=8,j,k = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[] =new int[4];
		j=Integer.parseInt(br.readLine());
		try
		{
		k=i/j;
		for(int b=0;b<=4;b++)
		{
			a[b]=b+1;
		}
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("divvide by 0" + e);
		}

		catch (ArrayIndexOutOfBoundsException c)
		{
			System.out.println("divvide by 0" + c);
		}
		System.out.println(k);
			
		}

}
