package methods;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		AreaOfTriangle  obj=new AreaOfTriangle ();
		double a1=obj.triangle();
		System.out.println("Triangle="+a1);
		System.out.println("Rectangle="+obj.rectangle(2,3));
		obj.circle(2);
		obj.squre();
	}
		
		public double triangle()
		{
			int b=2,h=2;
			double area=0.5*b*h;
			return area;
		}
		
		public int rectangle(int l,int b)
		{
			
			int area=l*b;
			return area;
		}
		
		public void circle(int r)
		{
			
			double area=3.14*r*r;
			System.out.println("Circle="+area);
		}
		
		public void squre()
		{
			int a=2;
			int area=a*a;
			System.out.println("squre="+area);
		}
		

	}


