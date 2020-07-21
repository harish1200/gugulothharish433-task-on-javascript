
public class Thread2 {
public static void main(String args[])
{
	BB obj= new BB();
	AAA obj1=new AAA();
	
	
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj1);
	
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


class BB  implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

 class AAA implements Runnable
{
	 public void run()
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("hello");
				try {
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					
				}
			}
		}
}
