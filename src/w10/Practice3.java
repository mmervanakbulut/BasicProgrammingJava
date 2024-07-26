package w10;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int scores[] = new int[10];
		for(int i = 0; i<10; i++) {
			System.out.printf("Number of students getting score between %2d-%2d : ",i*10,i*10+9);
			scores[i] = scan.nextInt();
		}
		System.out.println("Scale Distribution: ");
		for(int control = 0; control<scores.length; control++) {
			System.out.printf("%2d-%2d: ",control*10,control*10+9);
			for(int star = 0; star<scores[control]; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
