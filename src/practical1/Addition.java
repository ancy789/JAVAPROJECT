package practical1;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
	String ch;
		
		do {
			
			Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int sum=x+y;
			System.out.println("Sum of numbers are: "+sum);
			
			System.out.println("Would you like to continue?(yes/no)");
	        ch = sc.next();
		}while(ch.equalsIgnoreCase("yes"));

	}

}
