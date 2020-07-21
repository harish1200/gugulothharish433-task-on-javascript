
public class Thread5 {
public static void main(String argd[])
{
	 Q q=new Q();
	 new Producer(q);
	 new Consumer(q);
}
}
 
class Q
{
	int num;
	boolean valueSet=false;
	
	
	public synchronized void put(int num)
	{
		while(valueSet)
		{
			try {wait();}
			catch(Exception e) {}
		}
		System.out.println("put" + num);
		
	this.num=num;	
	valueSet=true;
	}
	public synchronized void get()
	{
		while(!valueSet)
	{
		try { wait();}
		catch(Exception e) {}
	}

		System.out.println("get"  +num);
		valueSet=false;
		notify();
	}
}

class Producer implements Runnable
{
	Q q;
	 
	public Producer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"producer");
		t.start();
	}
	
	public void run()
	{
	int i=0;
	while(true)
	{
		q.put(i++);
		try { Thread.sleep(1000); }
		catch(Exception e) {}
		}
	}
	}

class Consumer  implements Runnable
{
	Q q;

	public Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"producer");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
			try { Thread.sleep(2000); }
			catch(Exception e) {}
			}
			
		}
	}

