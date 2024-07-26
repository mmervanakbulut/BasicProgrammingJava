package vize;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// Question-3
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the starting point of the last row: ");
		int thePoint = scan.nextInt();
				
				
		for(int i = 0; i<=thePoint; i++) {
			for(int j = 9-i; j<9; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.print("* ");
			for(int j = 9; j>9-i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();	
			}
		scan.close();
	}

}
