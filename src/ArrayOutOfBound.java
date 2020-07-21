import java.util.Random;

public class ArrayOutOfBound {
public static void main(String args[])
{
	Random r=new Random();
	int a[]=new int[50];
	
	for(int i1=0;i1<a.length;i1++)
	{
		a[i1]=r.nextInt(50);
	}
	try {
		System.out.println(a[52]);
		}
	catch(Exception e)
	{
		System.out.println("the max size is 49");
	}
	
	for(int i1:a)
	{
		System.out.println(i1);
	}
}
}

