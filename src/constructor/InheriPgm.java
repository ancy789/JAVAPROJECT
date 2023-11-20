package constructor;


class Member
{
	String name;
	int age;
	int phno;
	String address;
	int salary;
	
	public void printDetails()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("PhNo="+phno);
		System.out.println("Address="+address);
		System.out.println("Salary="+salary);
	}
}

class Employee extends Member
{
	String specialization;
	public void empDetails()
	{
		System.out.println("Specialization=computer science");
	}
}
class Manager extends Member
{
	String department;
	public void managerDetails()
	{
		System.out.println("Department="+department);
	}
	
}

public class InheriPgm {

	public static void main(String[] args) {
		Employee ob1=new Employee();
		ob1.name="Arya";
		ob1.age=20;
        ob1.phno=2324243;
        ob1.address="Kannampuzha";
        ob1.salary=2000;
        ob1.printDetails();
        ob1.specialization="cs";
        ob1.empDetails();
        
        System.out.println(" ");
		Manager ob2=new Manager();
		ob2.name="Anna";
		ob2.age=23;
        ob2.phno=24243;
        ob2.address="Thattil";
        ob2.salary=20002;
        ob2.department="HR";
        
        ob2.printDetails();
        ob2.managerDetails();
		
		
		

	}

}
