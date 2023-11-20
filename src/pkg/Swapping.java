package pkg;

public class Swapping {

	public static void main(String[] args) {
		int a=20,b=30;
//		int c;
//		
//		System.out.println("Before swapping:"+" a= "+a+" b= "+b);
//		
//		c=a;
//		a=b;
//		b=c;
//		
//		System.out.println("After swapping: "+" a= "+a+" b= "+b);
		
		System.out.println("---Before swapping----");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		a=a+b;//a=50
		b=a-b;//20
		a=a-b;//30
		
		System.out.println("---After swapping---");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		

	}

}
