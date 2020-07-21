
public class ToString {
public static void main(String args[])
{
	Student s1=new Student(11,"Naveen");
	System.out.println(s1.toString());
}
}

class Student extends Object
{
int roll;
String name;

public  Student(int roll , String name)
{
	this.roll=roll;
	this. name=name;
	
	
}
public String toString() {
	return roll + " " + name;
}
}