import java.util.Scanner;
public class SwitchRuntime {

	public static void main(String args[])
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter a no");
	int n=sc.nextInt();
	
		
		 switch(n)
		 {
		 case 1:System.out.println("hello world");
			case 2:System.out.println("hello ");//use break to stop loop
			break;
			case 3:System.out.println(" world");
			default:System.out.println(" error");
		 }
		
	}
}
