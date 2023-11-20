package constructor;

import java.util.Scanner;

public class FibinacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		fibi(n);
//		AcessModifiers ob=new AcessModifiers();
//		System.out.println(ob.c);
		
	}
		
	public static void fibi(int n) 
		{
	
		 int n1=0,n2=1;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		 for(int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  int n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}
