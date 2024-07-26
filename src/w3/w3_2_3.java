package w3;

import java.util.Scanner;

public class w3_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner theAge = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = theAge.nextInt();
		if(age>=0 && age<=9) {
			System.out.println("Kid");
		}else if(age>=10 && age<=19) {
			System.out.println("Teenager");
		}else if(age>=20 && age<=49) {
			System.out.println("Adult");
		}else if(age>=50) {
			System.out.println("Old");
		}
		
		theAge.close();
		
	}

}
