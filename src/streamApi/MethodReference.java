package streamApi;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String args[])
	{
		List<String> values=Arrays.asList("akhil","ravi","ramu");
	
		values.forEach(System.out::println);
	}
}
