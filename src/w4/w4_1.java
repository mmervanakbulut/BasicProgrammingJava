package w4;

import java.util.Scanner;

public class w4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println(scan);
		
		System.out.println("num between 0-5: ");
		int myNum = scan.nextInt();
		
		switch(myNum) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			default:
				System.out.println("the number must be between 0 and 5.");
				break;
		}
		
	}

}
