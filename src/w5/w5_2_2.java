package w5;

import java.util.Scanner;

public class w5_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Satır sayısını girin: ");
		int satir = scanner.nextInt();
		System.out.print("Sütun sayısını girin: ");
		int sutun = scanner.nextInt();
		System.out.print("Karakteri girin: ");
		char karakter = scanner.next().charAt(0);
		
		for (int i = satir; i > 0; i--) {
			for (int j = sutun; j > 0; j--) {
				if (i == satir || i == 1 || j == sutun || j ==1 ) {
					System.out.print(karakter);				
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		scanner.close();
		
	}

}
