package sinavOncesi;

import java.util.Scanner;

public class binaryNumToTenBasedNum {

	public static void main(String[] args) {
		int binaryNum=0, c=0, b = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sadece 0 ve 1 rakamlarını kullan");
		binaryNum = scan.nextInt();
		
		for(int i = binaryNum; i>=0; i--) {
			int mode = binaryNum%10;
			binaryNum= binaryNum/10;
			b += mode * (int)(Math.pow(2, c));
			c++;
		}
		System.out.print(b);
		scan.close();
	}

}
