package practical1;

import java.util.Scanner;

public class StringCharCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int count=0;
		 for(int i=0;i<str.length();i++ )
		 {
			 if(str.charAt(i)!=0)
			 {
				 count++;
			 }
		 }
		 System.out.println("Number of characters in the string "+str+"="+count);
				

	}

}
