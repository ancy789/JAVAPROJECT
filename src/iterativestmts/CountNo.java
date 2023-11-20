package iterativestmts;

public class CountNo {

	public static void main(String[] args) {
		int n=343,m=0; 
		System.out.println("Input= "+n);
		while(n!=0)
		{
			
			n=n/10;
			m++;
		}
		System.out.println("Count= "+m);

	}

}
