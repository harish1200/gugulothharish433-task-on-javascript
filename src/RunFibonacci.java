import java.util.Scanner;
public class RunFibonacci {
	public static void main(String args[])
	{
		int a=1,b=1,k;
		Scanner sc=new Scanner(System.in);
		
		k=0;
		
		int n=sc.nextInt();
		System.out.print("1 1 ");
		
		while(k<n)
		{
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
			sc.close();
		}
	}
}
