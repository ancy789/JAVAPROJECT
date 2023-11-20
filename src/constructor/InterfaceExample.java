package constructor;


interface TVremote
{
	public void voulmeup();
	public void volumein();
	
}

interface SmartTVremote extends TVremote
{
	public void channel();
}

class TV implements SmartTVremote
{

	@Override
	public void voulmeup() {
		System.out.println("TV volumeup");
		
	}

	@Override
	public void volumein() {
		System.out.println("TV volumein");
	}

	@Override
	public void channel() {
		System.out.println("TV channel");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.volumein();
		ob.voulmeup();
		ob.channel();

	}

}
