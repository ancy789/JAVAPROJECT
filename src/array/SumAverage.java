package array;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int[] st = new int[3];
		int sum = 0, avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");

		for (int i = 0; i < 3; i++) {
			st[i] = sc.nextInt();
			sum = sum + st[i];
		}
		System.out.println("Sum=" + sum);
		System.out.println("Average=" + sum / 3);

	}

}
