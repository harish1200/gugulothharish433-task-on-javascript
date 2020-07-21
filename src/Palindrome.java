import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		int s=0,r;
		Scanner sc=new Scanner(System.in);
	
		
		System.out.print("enter a number");
		int n=sc.nextInt();
		int t=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
			if(t==s)
			{
				System.out.println("palindrome");
			} 
			else 
			{
					System.out.print(" not a palindrome");
			 }
			sc.close();
		}
	}
