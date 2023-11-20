package array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String[] array=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter names:");
		for(int i=0;i<4;i++)
		{
			array[i]=sc.nextLine();
		}
		System.out.println("Names are:");
		for(int i=0;i<5;i++)
		{
			System.out.println(array[i]);
		}
		

	}

}
