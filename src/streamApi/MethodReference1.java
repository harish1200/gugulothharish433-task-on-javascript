package streamApi;

public class MethodReference1 {
public static void main(String args[])

{

	String s="akhil";
	MyPrinter mp=new MyPrinter();
	mp.print(s,(StringParser::convert));
}
}

class MyPrinter
{
	public void print(String s,Parser p)
	{
		System.out.println(s);
	}
}

interface Parser
{
	String parse(String s);
}
class StringParser
{
	public static String convert(String str)
	{
		if(str.length()<=3)
			str=str.toUpperCase();
			else
				str=str.toLowerCase();
		return str;
	}
}