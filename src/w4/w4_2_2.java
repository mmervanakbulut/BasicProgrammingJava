package w4;

import java.util.Scanner;


public class w4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.print("num1: ");
		num1 = scan.nextInt();
		System.out.print("operator (* / + -) : ");
		char operator = scan.next().charAt(0);
		System.out.print("num2: ");
		num2 = scan.nextInt();
		
		
		switch (operator) {
		case '+':
			int toplam = num1 + num2; System.out.println("result: " + toplam);break;
		case '-':
			int cikarma = num1 - num2; System.out.println("result: " + cikarma);break;
		case '*':
			int carpma = num1 * num2; System.out.println("result: " + carpma);break;
		case '/':
			if (num2==0) {
				System.out.println("division by zero is not allowed.");
			}else {
				int bolme = num1 / num2; System.out.println("result: " + bolme);
			}
			break;
		default:
			System.out.println("olmadı bilader");
			break;
		}
		
		scan.close();
		
	}

}
