package enumeration;



enum Mobile3
{
	APPLE(100),JIO,NOKIA(110);
	int price;
	Mobile3()
	{
		price=88;
		System.out.println("constructor method");
	}
	Mobile3(int p)
	{
		price=p;
	}
	public int getPrice()
	{
		return price;
	}
}

/*class Mobile3
{
	static final Mobile3 APPLE=new Mobile3();
	static final Mobile3 JIO=new Mobile3();
	static final Mobile3 NOKIA=new Mobile3();
}*/


public class Enum3 {
	public static void main(String args[])
	{
		//enum using switch clase
		
		/*
	Mobile1 m=Mobile1.APPLE;
	switch(m)
	{
	case APPLE:
		System.out.println("apple is best");
		break;
	case JIO:
	System.out.println("jio is best");
	default:
		break;
	}*/
		
	//	System.out.println(Mobile3.APPLE.getPrice());
		//System.out.println(Mobile3.JIO.getPrice());
		//System.out.println(Mobile3.NOKIA.getPrice());
		
		Mobile3 m[]=Mobile3.values();
		for(Mobile3 mobile4:m)
		{
			System.out.println(mobile4 +" " +mobile4.getPrice());
		}
}
}

/*enum Mobile1
{
	APPLE,JIO,NOKIA;
}
*/