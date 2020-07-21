package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SA1 {

	public static void main(String args[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		//normal for loop
		/*for(int i=0;i<6;i++)
		{
			System.out.println(values.get(i));
		}*/
		
		//iterator method
		/*java.util.Iterator<Integer> i= values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
	//enhaced for loop
	/*	for(int i:values)
		{
			System.out.println(i);
		}
		*/
		
		//external iteration
		//internal iteration
		
		//consumer interface
		Consumer<Integer> c=(Integer i) ->	System.out.println(i);
		values.forEach(c);
		                   //or
		
		//values.forEach(i ->System.out.println(i));
	}
}
