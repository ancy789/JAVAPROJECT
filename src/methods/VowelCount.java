package methods;

import java.util.Scanner;


public class VowelCount{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		
		VowelCount vc=new VowelCount();
		int pt=vc.vowel(str);
		System.out.println("No of vowels="+pt);
	}
		
		
		public int vowel(String str)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				{
					count++;
				}
			}
			return count;
			
		}
				
		

	}


