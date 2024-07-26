package w6;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextCount = scanner.nextInt();
		int sum = 0;

		do {
			sum += nextCount;
			nextCount = scanner.nextInt();
		} while (nextCount < 5);
		System.out.println(sum);
		scanner.close();
	}

}
