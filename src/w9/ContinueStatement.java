package w9;

import java.util.Scanner;

public class ContinueStatement {

	public static void main(String[] args) {
		Double number, sum = 0.0;
		Scanner scan = new Scanner(System.in);
		for(int i = 1; i<6; i++) {
			System.out.print("Enter a number: ");
			number = scan.nextDouble();
			if(number<=0.0) {
				continue;
			}
			sum += number;
		}
		System.out.print(sum);
		scan.close();
	}
	

}
