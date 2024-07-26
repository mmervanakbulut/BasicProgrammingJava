package questions;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		int num, a;
		num = scanner.nextInt();
		String str = "";
		
		while(num>0) {
			a = num%2;
			str = a+""+str;
			num=num/2;
		}
		int b = 0, c = 0;
		int binaryNum = Integer.parseInt(str);
		
		for(int i = str.length()-1; i>=0; i--) {
			int mode = binaryNum%10;
			binaryNum= binaryNum/10;
			b += mode * (int)(Math.pow(2, c));
			c++;
		}
		System.out.println("binray number: " + str);
		System.out.print("Ten based num: " + b);
		scanner.close();
	}

}