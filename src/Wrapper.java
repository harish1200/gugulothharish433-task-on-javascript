import java.util.ArrayList;

public class Wrapper {
@SuppressWarnings("deprecation")
public static void main(String args[])throws Exception
{
	int i=5;
 Integer s=new Integer(i);//wrapping
 int j=s;//dewrapping
	System.out.println(j);
	
	ArrayList<Integer> a=new ArrayList<Integer>();//declared integer to use only int type of data
	//we can also use other type of primite data type
	a.add(7);
	System.out.println(a);
	
}
}
