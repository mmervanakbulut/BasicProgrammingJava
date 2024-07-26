package w13;

import java.util.Scanner;


public class P2 {
	
	public static void main(String[] args) {
		String myString = "";
		Scanner scan = new Scanner(System.in);
		myString = scan.next();
		for(int i = 0 ; i<myString.length(); i++) {
			System.out.println(myString.charAt(i));
		}
		scan.close();
	}
	
}
