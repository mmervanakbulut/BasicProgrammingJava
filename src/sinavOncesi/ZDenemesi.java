package sinavOncesi;

import java.util.Scanner;

public class ZDenemesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please give length of the letter Z: ");
		int length = scan.nextInt();
		
		
		for(int i = 0; i<length; i++) {
			for(int j = 0; j<length; j++) {
				if(i == 0 || i == length -1 || length - i - 1==j) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		scan.close();
	}

}
