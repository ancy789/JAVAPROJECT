package constructor;

//Abstraction by abstract class

abstract class Vehicle
{
	abstract public void start();
	abstract public void wheels();
	
	public void fan()
	{
		System.out.println("Hi");
	}
}
 class Jeep extends Vehicle
{

	@Override
	public void start() 
	{
		System.out.println("Start jeep engine");
	}

	@Override
	public void wheels() {
		System.out.println("4 wheels");
		
	}
	
}
class Auto extends Vehicle
{

	@Override
	public void start() {
		
		System.out.println("Start auto engine");	
	}

	@Override
	public void wheels() {
		
		System.out.println("3 wheels");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		Jeep ob1=new Jeep();
		ob1.start();
		ob1.wheels();
		Auto ob2=new Auto();
		ob2.start();
		ob2.wheels();
		ob1.fan();
		
		
	}

}
