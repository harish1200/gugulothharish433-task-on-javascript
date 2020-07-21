
public class Thread1 {
public static void main(String args[])
{
	Hi obj= new Hi();
	Who obj1=new Who();
	
	obj.start();
	try {
		Thread.sleep(50);
	}
	catch(Exception e)
	{
		
	}
	obj1.start();
	
	
}
}


class Hi extends Thread
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

 class Who extends Thread
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