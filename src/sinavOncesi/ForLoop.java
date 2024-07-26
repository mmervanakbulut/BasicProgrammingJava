package sinavOncesi;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Piramitin basamak sayısını girin: ");
		int basSayisi = scan.nextInt();
		for(int i = 1; i <= basSayisi; i++) {
			for(int j = i; j<basSayisi; j++) {
				System.out.print(" ");
			}
			for(int s = 1;s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
