package iterativestmts;

public class ReverseNum {

	public static void main(String[] args) {
		int n=340633;  
		System.out.println("Input= "+n);
		int reverse=0;
		while(n!=0)
		{
			int remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		System.out.println("Output= "+reverse);

	}

}
