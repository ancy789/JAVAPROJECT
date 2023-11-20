package array;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		String tr="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		String t1=str;
		
		int len=str.length();

	    for(int i=len-1;i>=0;i--)
	    {
	    	tr=tr+str.charAt(i);
	    	
	    }
	    System.out.println(tr);
	    if(t1.equals(tr))
	    {
	    	System.out.println("String is palindrome");
	    }
	    else
	    {
	    System.out.println("String is not palindrome");
	    }

	}

}
