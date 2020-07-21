package streamApi;

import java.util.Arrays;
import java.util.List;

public class SA9 {
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
		
		System.out.println(values.stream()
                                       .filter(SA9::isDivisible)
                                       .map(SA9::mapDouble)
                                       .findFirst()
                                       .orElse(0));
}
	public static boolean isDivisible(int i)
	{
		return i%5==0;
		
	}
	
	public static int mapDouble(int i)
	{
		return i*2;
		
	}
}