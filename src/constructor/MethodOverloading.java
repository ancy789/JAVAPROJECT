package constructor;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading ob=new MethodOverloading();
		ob.area(10,20);
		ob.area(2.5,5);
		ob.area(10);
		}
	
	public void area(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of rectangle="+area);
	}
	public void area(double h,int b)
	{
		double area=(b*h)/2;
		System.out.println("Area of traingle="+area);
	}
	public void area(int a)
	{
		int area=a*a;
		System.out.println("Area of square="+area);
	}


}
