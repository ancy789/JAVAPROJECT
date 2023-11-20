package constructor;

public class AcessModifiers {
	
	private int a=20;
	int b=10;
	protected int c=30;
	public int d=40;

	public static void main(String[] args) {
		AcessModifiers ob=new AcessModifiers();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		
		
		

	}

}

         //       withinclass   withinpkg     outsidepkg by subclass only     outside pkg

//   private           y           N                     N                          N
//   default           Y           Y                     N                          N
//   private           Y           Y                     Y                          N
//   public            Y           Y                     Y                          Y