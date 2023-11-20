package iterativestmts;

public class ArmstrongNum {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int a=0;
		
		while(n!=0)
		{
			int rem=n%10;
			a=a+rem*rem*rem;
			n=n/10;
		}
		if(a==temp)
		{
		System.out.println("The number is armstrong");
		}
		else {
		System.out.println("The number is not armstrong");
		}
}
}
