
public class Enhaced2dArray {
public static void main(String args[])
{
	int p[][]= {
			{5,6,7,8},
			{7,8,9,0},
			{3,4,5,6}
	};
	for(int i[]:p)
	{
		
		for(int j:i)
		{
			System.out.print(j + " ");
		}
		System.out.println(" ");
	}
	
}
}
