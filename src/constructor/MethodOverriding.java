package constructor;

class Car
{
	public void legs()
	{
		System.out.println("2 legs");
	}
}
class BMW extends Car
{

	@Override
	public void legs() {
		System.out.println("4 legs");
		super.legs();
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		BMW ob=new BMW();
		ob.legs();

	}

}
