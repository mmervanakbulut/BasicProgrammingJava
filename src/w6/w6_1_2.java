package w6;

import java.util.Scanner;

public class w6_1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nextCount = scanner.nextInt();
		int sum = 0;
		while (nextCount<8) {
			sum += nextCount;
			nextCount = scanner.nextInt();
		}
		System.out.println(sum);
		scanner.close();
	}

}
