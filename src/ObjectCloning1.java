/*shallow copy
 * 
 * A obj1=obj;
 
*/

/*deep copy
 * A obj1=new obj1();
 * obj1.i=obj.i;
 * obj1.j=obj.j;
 */


/*cloning
 * 
 * A obj1=new obj1();
 * obj1=obj.clone();
 * clonable interface
 * 
 * 
 */
public class ObjectCloning1 {
	public static void main(String args[])throws CloneNotSupportedException 
	{
	/*shallow
	Shallow s=new Shallow();
		s.i=5;
		s.k=6;
		System.out.println(s);

		Shallow s1=s;
		System.out.println(s1);
		s1.k=8;
		System.out.println(s1);

	*/
		
		
		
	/*deep
		Shallow a=new Shallow();
		a.i=5;
		a.k=6;
		System.out.println(a);

		Shallow a1=a;
		a1.i=a.i;
		a1.k=a.k;
		System.out.println(a1);

		a1.k=8;
		
		System.out.println(a1);
	*/
	
	/*
	 * clone
	 */
	
		Shallow a=new Shallow();
		a.i=5;
		a.k=6;
		System.out.println(a);

		Shallow a1=a.clone();
		
		a1.k=8;
		System.out.println(a1);
}

}

class Shallow  implements Cloneable
{
	int i;
	int k;
	
	public String toString()
	{
		return "shallow {" + i + " " + k + " } ";
	}

	public Shallow clone() throws CloneNotSupportedException 
	{
		return (Shallow) super.clone();
	}
}