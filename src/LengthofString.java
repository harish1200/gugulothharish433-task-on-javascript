import java.util.Scanner;

public class LengthofString {
public static void main(String args[])
{
	String  e1,e2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 string");
	e1=sc.nextLine();
	e2=sc.nextLine();
	int l1,l2;
	l1=e1.length();
	l2=e2.length();
	System.out.printf("%d,%d",l1,l2);
	 String e3=e1.concat(e2);
	 System.out.println(e3);
	 
	 e1=e1.toUpperCase();
	 e2=e2.toUpperCase();
	 System.out.printf("%s,%s",e1,e2);
	sc.close(); 
}
}
