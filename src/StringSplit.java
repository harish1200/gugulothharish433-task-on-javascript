
public class StringSplit {
public static void main(String args[])
{
	String str="navin,ramesh,rahul";
	String names[] =str.split(",");
	for(String values :names)
		System.out.println(values);
}
}
