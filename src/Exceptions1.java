
public interface Exceptions1 {
	public static void main(String args[]) {
int i=8,j=0,k = 0;

try
{
k=i/j;
}
catch (ArithmeticException e)
{
	System.out.println("divvide by 0" + e);
}
System.out.println(k);
	
}
	}

