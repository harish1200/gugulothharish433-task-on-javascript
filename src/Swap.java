import java.util.Scanner;

public class Swap {
	public static void main(String args[])
	{ int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		 int a=sc.nextInt();
		 System.out.println("enter b value");
		 int b=sc.nextInt();
		 
		 temp=a;
		 a=b;
		 b=temp;
		System.out.println("value of a is:" + a); 
		
		System.out.println("value of b is:" + b);
		sc.close();
}
}

