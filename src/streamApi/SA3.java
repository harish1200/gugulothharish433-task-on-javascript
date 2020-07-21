package streamApi;

import java.util.Arrays;
import java.util.List;

public class SA3 {
	public static void main(String args[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		
	// values.forEach(System.out::println);//call by method
	
		//values.forEach(i -> doubleit(i));
		
	values.forEach(SA3::doubleit);
	}
	
	public static void doubleit(int i)
	{
		System.out.println(i*2);
	}
}
