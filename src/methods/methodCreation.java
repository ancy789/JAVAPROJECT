package methods;

public class methodCreation {

	public static void main(String[] args) {
		methodCreation  ob=new methodCreation();
		int sum=ob.add();
		System.out.println("Addition="+sum);
		
		System.out.println("Substraction="+ob.sub(20, 10));
		ob.mult(20, 10);
		ob.div();
	}

	public int add()    //1.method with return type and without parameter
	{
		int a=10,b=10;
		int c=a+b;
		return c;
	}
	
	public int sub(int a,int b)  //2.method with return type and with parameter
	{
		int c=a-b;
		return c;
	}
	
	public void mult(int a,int b)  //3.method without return type and with parameter
	{
		int c=a*b;
		System.out.println("Multi="+c);
	}
	
	public void div()          //4.method without return type and without parameter
	{
		int a=20,b=10;
		int c=a/b;
		System.out.println("Division="+c);
	}
	
	
	
}
