package w3;

import java.util.Scanner;

public class w3_1 {

	public static void main(String[] args) {
		int a = 4;
		if(a<5) {
			System.out.println("oldu");
		} 
		System.out.println("bu da oldu");
		// 
		int num1, num2;
		Scanner myNums = new Scanner(System.in);
		System.out.println("Num1: ");
		num1 =  myNums.nextInt();
		System.out.println("Num2: ");
		num2 =  myNums.nextInt();

		if(num1> num2) {
			System.out.println("num1 is bigger than num2");
		}else if(num1 == num2) {
			System.out.println("they are equal");
		}else {
			System.out.println("num2 is bigger than num1");
			
		}
		
		int num;
		System.out.println("num: ");
		num = myNums.nextInt();
		
		if(num > 0) {
			System.out.println("num is possitive");
		}else if(num == 0) {
			System.out.println("num is zero");
		}else {
			System.out.println("num is negative");
		}
		
		
		
		System.out.println("Year: ");
		int year = myNums.nextInt();
		System.out.println(year%4);
		
		// compare
		int num3, num4;
		System.out.println("num3: ");
		num3 =myNums.nextInt();
		System.out.println("num4: ");
		num4 = myNums.nextInt();
		System.out.println(num3%num4 == 0);
		
		// grade coparison
		int grade;
		System.out.println("grade: ");
		grade = myNums.nextInt();
		if(grade >= 90) System.out.println("grade A");
		else if(grade >= 80) System.out.println("grade B ");
		else if(grade >= 70) System.out.println("grade C");
		else if(grade >= 60) System.out.println("grade E");
		else if(grade <= 59) System.out.println("grade F");
		
		myNums.close();
	}

}
