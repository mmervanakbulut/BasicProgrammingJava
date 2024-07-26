package questions;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("v boyut: ");
		int v = scan.nextInt();
		int a = 1;

		for (int i = 1; i <= v; i++) {
			// first spaces
			for(int j = 1; j<i;j++) {
				System.out.print(" ");
			}
			for (int j = a; j < v * 2; j++) {
				if(j==a || j==(v*2)-1) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			a = a+2;
		}
		scan.close();

	}

}
