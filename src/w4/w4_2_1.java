package w4;

import java.util.Scanner;

public class w4_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);System.out.println(scan);
		
		System.out.println("Day between 1-7: ");
		int days = scan.nextInt();
		
		switch(days) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friyday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("The number must be between 1-7");
				break;
		}
	}

}
