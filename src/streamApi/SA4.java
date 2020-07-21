package streamApi;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class SA4 {
public static void main(String args[])
{
	List<Integer> values=new ArrayList<>();
	
	for(int i=0;i<=100;i++)
	{
		values.add(i);
	}
	//values.parallelStream().forEach(System.out::println);
System.out.println(values.stream().filter(i ->{
	System.out.println("hi");
	return true;
}).findFirst().orElse(0));

}
}
