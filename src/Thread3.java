
public class Thread3 {
public static void main(String args[])
{
	
	Thread t1=new Thread(() ->
	{
			for(int i=0;i<5;i++)
			{
				System.out.println("hi" +  " " + Thread.currentThread().getPriority());
				try {Thread.sleep(500);}catch(Exception e) {}
			}
			
	},"hi thread");
	
	
	Thread t2=new Thread(() ->
	{
			for(int i=0;i<5;i++)
			{
				System.out.println("hello"  +  " " + Thread.currentThread().getPriority());
				try {Thread.sleep(500);} catch(Exception e) {}
			}
			
	},"hello thread");
	;
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	
	t1.setPriority(1);
	t2.setPriority(10);
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
	t1.start();
	try {
		Thread.sleep(50);
	}
	catch(Exception e)
	{
		
	}
	t2.start();
	
	

}

}

