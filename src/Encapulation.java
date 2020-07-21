
public class Encapulation {
public static void main(String args[])
{
	D obj=new D();
	obj.setI(5);
	System.out.println(obj.getI());
}




}
class D
{
	private int i;
	public void setI(int j)
	{
		i=j;
		
	}
	public int getI()
	{
		return i;
	}
}