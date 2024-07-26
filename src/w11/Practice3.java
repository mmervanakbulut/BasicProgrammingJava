package w11;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int matris[][] = new int[a][a];
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				matris[i][j] = (int) (Math.random() * a);
				System.out.printf("%3d",matris[i][j]);
			}
			System.out.println();
		}
		
		int total = 0;
		for (int i = 0; i < a; i++) {
			total += matris[i][i];
		}
		System.out.print("toplam: " + total);
		scan.close();
	}

}
