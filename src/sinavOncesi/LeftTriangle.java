package sinavOncesi;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Height of the pyramid: ");
		int height = scan.nextInt();
		int totalHi = height *2-1;
		
		for(int i = 1; i <= height*2-2; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		for(int i = height*2; i > 0; i-- ) {
			for(int j = totalHi; j>0;j--) {
				System.out.print("*");
				
			}
			totalHi--;
			System.out.println();
		}
		scan.close();
		
	}

}
