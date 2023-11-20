package constructor;

interface Phone
{
	public void call();
	public void volume();
}
interface Maas extends Phone
{
	public void camera();
	
}
class Samsung implements Phone,Maas
{

	@Override
	public void call() {
		System.out.println("Samsung call");
		
	}

	@Override
	public void volume() {
		
		System.out.println("Samsung volume");
	}

	@Override
	public void camera() {
		System.out.println("Samsung camers");
		
	}
}
class Iphone implements Phone
	{

		@Override
		public void call() {
			System.out.println("Iphone call");
			
		}

		@Override
		public void volume() {
			System.out.println("Iphone voulme");
			
		}
		
	}

public class Interfacepgm {
	
	public static void main(String[] args) {
		
		Phone ob=new Iphone();
		ob.call();
		ob.volume();
		Samsung ob1=new Samsung();
		ob1.call();
		ob1.volume();
		ob1.camera();

	}

	}
	
