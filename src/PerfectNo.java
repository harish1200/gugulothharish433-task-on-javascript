import java.util.Scanner;
public class PerfectNo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		 int n=sc.nextInt();
		 
		 boolean b=isPerfect(n);
		 if(b)
		 
		     System.out.println("perfect");
	
		 else
			 
			 System.out.println("not perfect");
		 sc.close();
	}
public static boolean isPerfect(int n)
{
	int sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
			sum=sum+i;
	}
			if(n==sum)
			return true;
	return false;
	
}
}

