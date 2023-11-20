package practical1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String re=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
		  re=re+str.charAt(i);
		}
		System.out.println("Reverse of the string ="+re);

	}

}
