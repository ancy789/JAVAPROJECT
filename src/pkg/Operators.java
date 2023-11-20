package pkg;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic Operators
		int a=20,b=20;
		
		System.out.println("----Arithmetic Operators----");
		
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a%b= "+(a%b));
		System.out.println("a/b= "+(a/b)); //quotient
		System.out.println("a*b= "+(a*b)); //remainder
		
		System.out.println("----Assignment Operators----");
		
		System.out.println((a+=b)); //a=a+b 20+20=40
		System.out.println((a-=b)); //a=a-b 40-20=20
		System.out.println((a/=b));  //a=a/b 20/20=1
		System.out.println((a*=b)); //a=a*b 1*20=20
		
		
		System.out.println("----Relational Operators----");
		
		int c=20,d=40;
		
		System.out.println((c<d));
		System.out.println((c<=d));
		System.out.println((c>d));
		System.out.println((c>=d));
		System.out.println((c==d));
		System.out.println((c!=d));
		
		
		System.out.println("----Logical Operators----");
		 String username="abc";
		 String pwd="123";
		 
		 System.out.println(username=="abc"&& pwd=="123");//true
		 System.out.println(username=="abc"|| pwd=="13");//true
		 System.out.println(!(username=="abc"));//false
		 
		 System.out.println("----Unary Operators----");
		 //++ increment by 1 ++1 pre increment  1++ post increment
		 //-- decrement by 1  --1 predecrement  
		 int v1=3;
		 System.out.println(v1++); //3
		 System.out.println(v1);//4
		 System.out.println(++v1);//5
		 
		 System.out.println("----Ternary Operators----"); 
		 int v2=20,v3=30;
		 int v4=v2<v3?v2:v3;
		 System.out.println(v4);
		 
		 String v5=v2<v3?"V2 is smaller":"V3 is greater";
		 System.out.println(v5);
		 
		
		

	}

}
