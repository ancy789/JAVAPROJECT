package iterativestmts;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Even numbers are:");
		int evensum=0,evencount=0;
		int oddsum=0,oddcount=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
				evensum=evensum+i;
				evencount++;
				
			}
		}
		System.out.println("\n");
		System.out.println("Odd numbers are:");
		for(int i=1;i<=50;i++)
			{ if(i%2!=0)
		{
			System.out.print(i +" ");
			oddsum=oddsum+i;
			oddcount++;
			}
		}
		System.out.println("\n");
		System.out.println("Even count is ="+evencount);
		System.out.println("odd count is ="+oddcount);
		System.out.println("\n");
System.out.println("Even sum is ="+evensum);
System.out.println("odd sum is ="+oddsum);
	}

}
