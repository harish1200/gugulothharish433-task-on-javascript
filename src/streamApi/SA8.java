package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SA8 {
	public static void main(String args[])
	{
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
		
		//step 1
		
		int res=0;
		for(int i:values)
		{
			if(i%5==0)
			{
				res+=i;
			}
		}
		System.out.println(res);
		
		//step 2
		
		System.out.println(values.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
		
	
		//step 3
		
		Predicate<Integer> p=new Predicate<Integer>()
		{

		
			public boolean test(Integer i) {
			
				return i%5==0;
			}
};
		System.out.println(values.stream().filter(p).reduce(0,Integer::sum));
	
		
		//step 4
		
		System.out.println(values.stream().filter(new Predicate<Integer>()
		{

		
			public boolean test(Integer i) 
			      {
			
				return i%5==0;
			      
			      }
            
		           }).reduce(0,Integer::sum));
		
		
		//step 5
		System.out.println(values.stream()
				                           .filter(i -> i%5==0)
				                           .map(i ->i*2)
				                           .reduce(0,Integer::sum));
		
	
		//step 6
		System.out.println(values.stream()
                                           .filter(i -> i%5==0)
                                           .map(i ->i*2)
                                           .findFirst()
                                            .orElse(0));
	
		//step 7
		System.out.println(values.stream()
                                          .filter(i -> i%5==0)
                                          .map(i ->i*2)
                                          .findAny()
                                          .orElse(0));
		
	}
	
}
