package practical1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int no=sc.nextInt();
		for(int i=2;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Fcatorial of "+no+" is "+fact);
		
	}

}
