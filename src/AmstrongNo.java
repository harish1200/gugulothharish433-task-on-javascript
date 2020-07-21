import java.util.Scanner;

public class AmstrongNo {
	public static void main(String args[])
	{ int r,sum = 0,n = 0;
	
	int temp=n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		 n=sc.nextInt();
while(n>0)
{
	r=n%10;
	n=n/10;
	sum=sum+ r*r*r;
	
}
if(temp==sum)

	System.out.println("Amstrong no");
else
		System.out.println("Not an Amstrong No");
sc.close();
	}
	
	}

