package constructor;

public class StaticFinal {
	
	int a=10;
	static int b=10; ////possible to change the value .Without creating object we can access static variable
	final int d=20;  //not possible to change the value
	static final double pi=3.14;

	public static void main(String[] args) {
		 System.out.println(b);
         StaticFinal ob=new StaticFinal();
         System.out.println(ob.b=34);
         System.out.println(23);
         System.out.println(ob.d);
         System.out.println(pi);
         
	}

}
