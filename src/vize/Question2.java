package vize;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Question-2
		int inputNum, i = 2;
		String devider = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Number: ");
		inputNum = scan.nextInt();
		int a = inputNum;
		scan.close();		
				
		for(i =2; i<=a;i++) {
			while(inputNum%i==0) {
				devider =  devider +" "+ i;
				inputNum = inputNum / i;
			}
					
		}
				
		System.out.print(devider);
	}

}
