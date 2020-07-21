
public class Enc1{
	
	public static void main(String args[])
	{
	Emp obj1=new Emp();
	obj1.setEmpId(5);
	obj1.setEmpName("akhil");
	Emp obj2=new Emp();
	
	obj2.setEmpId(4);
	obj2.setEmpName("akhila");
	System.out.println(obj1.getEmpId());
	System.out.println(obj1.getEmpName());
	
	}

}

class Emp
{
	private int empId;
	private String empName;
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public String getEmpName()
	{
		return empName;
	}
	
}