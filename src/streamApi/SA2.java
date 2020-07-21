package streamApi;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class SA2 {

	public static void main(String args[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
	/*	Consumer<Integer> c=new Consumer<Integer>()
				{
			public void accept(Integer i)
			{
				System.out.println(i);
			}

				};
				*/
		
		values.forEach( i->	System.out.println(i));
		values.forEach(System.out::println);//System.out.println(i); call by value ,call by reference,call my method
}

}
