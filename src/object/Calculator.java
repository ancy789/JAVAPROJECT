package object;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int ch;
		do {
			System.out.println("1.Addition, 2.Substraction, 3.Multiplication, 4.Division");
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter two numbers: ");
			int x = sc.nextInt();
			int y = sc.nextInt();

			System.out.println("Enter your choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Addition: " + (x + y));
				break;
			case 2:
				System.out.println("Substraction: " + (x - y));

				break;
			case 3:
				System.out.println("Multiplication: " + (x * y));

				break;
			case 4:
				System.out.println("Division: " + (x / y));

				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (ch < 4);

	}
}
