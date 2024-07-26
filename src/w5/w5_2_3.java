package w5;

// scanner class added to the project
import java.util.Scanner;

public class w5_2_3 {

	public static void main(String[] args) throws InterruptedException {
		// Scanner object created
		Scanner scanner = new Scanner(System.in);
		System.out.print("Count of stairs: ");
		// stair count
		int basamakSayisi = scanner.nextInt();
		// Drawing steps of the stairs
		for (int i = 1; i <= basamakSayisi; i++) {
			// Loop for spaces
			for (int a = 2; a <= i; a++) {
				System.out.print("     ");
			}
			
			// Drawing steps of the stairs
			System.out.printf("____%d\n", i); 
			// Loop for spaces
			for (int a = 2; a <= i; a++) {
				System.out.print("     ");
			} 
			System.out.print("    |\n");
			// Loop for spaces
			for (int a = 2; a <= i; a++) {
				System.out.print("     ");
			}
			System.out.print("    |");
			System.out.println();
		}
		scanner.close();
	}
}