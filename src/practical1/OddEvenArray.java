package practical1;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//System.out.println("Array values are:");
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("Even numbers are:");
			 if(arr[i]%2==0)
			 {
				 System.out.println(arr[i]+" ");
			 }
		 }
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("Odd numbers are:");
			 if(arr[i]%2==0)
			 {
				 System.out.println(arr[i]+" ");
			 }
		 }
		 
	 }
		
	}


