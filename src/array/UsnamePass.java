package array;

import java.util.Scanner;

public class UsnamePass {

	public static void main(String[] args) {
		String[][] array=new String[4][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username and password");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				array[i][j]=sc.nextLine();
				
			}
			
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
