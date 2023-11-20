package controlstmts;

public class Elseifpgm {

	public static void main(String[] args) {
		int a=20,b=200,c=30;
		if(a>b && a>c)
		{
			System.out.println("a is greater ");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}

}
