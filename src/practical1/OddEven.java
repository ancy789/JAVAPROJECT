package practical1;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
    	}
		for(int i=0;i<5;i++)//for each loop
		{
			if(arr[i]%2==0)
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
