package constructor;

interface Kings
{
	public void legs();
	public void color();
	public void wings();
	
default  void ears()
	{
		System.out.println("2 ears");
	}
	
}

class Elephant implements Kings{

	@Override
	public void legs() {
		System.out.println("4 legs");
		
		
	}

	@Override
	public void color() {
		System.out.println("Balck");
		
	}

	@Override
	public void wings() {
		System.out.println("No wings");
		
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		
		Elephant ob=new Elephant();
		ob.legs();
		ob.wings();
		ob.color();
		ob.ears();
		

	}

}
