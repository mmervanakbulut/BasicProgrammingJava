package sinavOncesi;

import java.util.Scanner;

public class DiamondShape {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("diamond basamakları: ");
		int v = scan.nextInt();

		for (int i = 1; i <= v; i++) {
			for (int t = i; t < v; t++) {
				System.out.print(" ");
			}

			for (int j = 1; j < i + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int artan = 1;
		for(int i = v -1; i>0; i--) {
			for(int k = 1; k <= artan; k++) {
				System.out.print(" ");
				if(artan == v) {
					break;
				}
			}
			artan++;
			for (int j = 1; j < i + i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
		
		
	}

}
