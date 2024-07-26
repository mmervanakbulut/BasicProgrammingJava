package questions;

import java.util.Scanner;

public class Q3Again {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Num: ");
		int satir = scan.nextInt();
		
		for(int i = 1; i<=satir;i++) {
			
			for(int j = 1; j< satir*2; j++) {
				if(i==j || j==2*satir-i) {
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
