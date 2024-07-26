package vize;

import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// Question-1
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of side 1: ");
		int side1 = scan.nextInt();
		System.out.print("Enter the length of side 2: ");
		int side2 = scan.nextInt();
		System.out.print("Enter the length of side 3: ");
		int side3 = scan.nextInt();
				
		if(side1 < side2 + side3 && side2 < side1 + side3 && side3<side1+side3) {
			System.out.print("This is a triangle");
		}else {
			System.out.print("These side lengths do not form a valid triangle.");
		}
		scan.close();
	}

}
