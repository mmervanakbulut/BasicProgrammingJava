package w3;

import java.util.Scanner;

public class w3_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aw = new Scanner(System.in);
		
		System.out.println("Age: ");
		int age = aw.nextInt();
		System.out.println("Weight: ");
		int weight = aw.nextInt();
		if(age <=65 && age >= 18 && weight >=50) {
			System.out.println("Suitable for getting blood");
		}else {
			System.out.println("Unsuitable for getting blood");
		}
		aw.close();
	}

}
