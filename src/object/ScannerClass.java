package object;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("Enter two number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The numbers are "+a+" "+b);
	}

}
