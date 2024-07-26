package w5;

import java.util.Scanner;


public class w5_1_2 {

	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("column: ");
		int column = scanner.nextInt();
		System.out.print("row: ");
		int row = scanner.nextInt();
		System.out.flush();
		
		
		for(int i = 0; i < column; i++) {
			for(int j = 1; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
