
public class Exception2 {
	public static void main(String args[]) {
int i=8,j=2,k = 0;
int a[] =new int[4];
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
