package w5;

import java.util.Scanner;

public class w5_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println("Line" + i);
		}
		
		int total2 = 0;
		int total = 0;
		int myNum = 0;
		System.out.print("number: ");
		Scanner scan = new Scanner(System.in);
		myNum = scan.nextInt();
		scan.close();
		for (int i = 1; i <= 1000; i++) {
			
			total+=i;
		}
		// 
		for (int j = 1; j <= myNum; j++) {	
			total2 += j;
		}
		
		System.out.println(total2);
		System.out.println(total);
		
		int x, y;
		for(x=0, y=10; x<= y; x++, y--) {
			System.out.println(x+", "+y);
		}
		
		
	}

}
