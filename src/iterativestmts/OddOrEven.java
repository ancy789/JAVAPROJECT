package iterativestmts;

public class OddOrEven {

	public static void main(String[] args) {
		int evensum=0;
		int oddsum=0;
		
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				evensum++;
			}
			else
			{
				oddsum++;
				
			}
		}
		System.out.println("Total number of even numbers= "+evensum);
		System.out.println("Total number of odd numbers="+oddsum);
	}

}
