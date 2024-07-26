package w3;
import java.util.Scanner;

public class w3_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ages = new Scanner(System.in);
		System.out.println("Ali's age: ");
		int aliAge = ages.nextInt();
		System.out.println("Zeynep's age: ");
		int zeynepAge = ages.nextInt();
		System.out.println("Ahmet's age: ");
		int ahmetAge = ages.nextInt();
		
		
		if(zeynepAge > ahmetAge && zeynepAge > aliAge) {
			System.out.println("Zeynep is older.");
		}else if(aliAge > ahmetAge && aliAge > zeynepAge) {
			System.out.println("Ali is older.");
		}else if(ahmetAge > aliAge && ahmetAge > zeynepAge) {
			System.out.println("Ahmet is older.");
		}else {
			System.out.println("They are same age");
		}
		
		ages.close();
		
	}

}
