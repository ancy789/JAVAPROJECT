package constructor;

class Animal
{
	public void animalDetails()
	{
		System.out.println("Animal Details");
	}
}
class Dog extends Animal
{
	public void dogDetails()
	{
		System.out.println("Dog Details");    
	}
}
class Cat extends Dog
{
	public void catDetails()
	{
		System.out.println("cat Details");
	}
}

public class InheritancePgm {

	public static void main(String[] args) {
		Cat ob=new Cat();
		ob.animalDetails();
		ob.dogDetails();
		ob.catDetails();
		}

}
