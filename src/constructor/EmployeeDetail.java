package constructor;

public class EmployeeDetail {
	
	int empid;       //class attributes
	String empname;
	
	public EmployeeDetail(int empid,String empname)      //Constructor    //parameters
	{
		this.empid=empid;   //this keyword is used to eliminate the confusion between class attributes and parameters with the same name
		this.empname=empname;
	}

	public static void main(String[] args) {
		
		EmployeeDetail obj=new EmployeeDetail(101,"Arya");
		obj.printDetail();

	}
	
	public void printDetail()
	{
		System.out.println("Empid="+empid);
		System.out.println("Empname="+empname);
		
		
	}

}
