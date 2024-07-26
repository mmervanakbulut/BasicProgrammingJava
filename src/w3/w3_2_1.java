package w3;

import java.util.Scanner;

public class w3_2_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myNums = new Scanner(System.in);
		
		System.out.println("number: ");
		int num1 = myNums.nextInt();
		if(num1%2 == 0) {
			System.out.println("number is even");
		}else if(num1%2 ==1) {
			System.out.println("number is odd");
		}else {
			System.out.println("sth is wrong");
		}
		myNums.close();
		
	}

}
