package constructor;

class A
{
	public void aDetail()
	{
		System.out.println("Animal");
	}
}
class B extends A
{
	public void bDetail()
	{
		System.out.println("Dog");
	}
}
class C extends A 
{
	public void cDetail()
	{
		System.out.println("cat");
	}
}

public class HierarchicalInheri {
	
	public static void main(String[] args) {
		
		B ob1=new B();
		C ob2=new C();
	    ob1.aDetail();
		ob1.bDetail();
		//ob2.aDetail();
		ob2.cDetail();
	}

}
