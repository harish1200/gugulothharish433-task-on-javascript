package streamApi;

import java.util.Arrays;
import java.util.List;
//import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.stream.Stream;

public class SA7 {
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
// step 1
/*	
Stream<Integer> s=values.stream();

Stream<Integer> s1=s.map(new Function<Integer,Integer>()
{
public Integer apply(Integer i)
{
return i*2;
}
});


Integer result=(Integer)s1.reduce(0,new BinaryOperator<Integer>()
{
	
	public Integer apply(Integer i,Integer j)
	{
		return i+j;
	}
	
	});

System.out.println(result);


//step 2

Stream<Integer> s=values.stream();
Stream<Integer> s1=s.map(i -> i*2);
Integer result=(Integer)s1.reduce(0,(c,e) ->c+e);
System.out.println(result);


// step 3
 * 
 * Stream<Integer> s=values.stream();
Integer result=s.map(i -> i*2).reduce(0,(c,e) ->c+e);
System.out.println(result);


//step 4

 Integer result=values.stream().map(i -> i*2).reduce(0,(c,e) ->c+e);
 System.out.println(result);

		
		
 //step 5
  
  System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) ->c+e));
 
  
  //step 6
  System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) ->Integer.sum(c,e)));
*/

//step 7
	
		 System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));			
}
}