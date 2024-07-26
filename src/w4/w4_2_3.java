package w4;

import java.util.Scanner;

public class w4_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
			System.out.println("Grade: ");
			int grade = s.nextInt();
			
			switch(grade / 10) {
			case 0 :
			case 1 :
			case 2 :
			case 3 :
			case 4 :
			case 5 :
				System.out.println("F 0-59");
				break;
			case 6 :
				System.out.println("D 60-69");
				break;
			case 7 :
				System.out.println("C 70-79");
				break;
			case 8 :
				System.out.println("B 80-89");
				break;
			case 9 :
			case 10 :
				System.out.println("A 100-90");
				break;
			default:
				System.out.println("UNEXPECTED INPUT");
				break;
			}
			s.close();
		
		
	}

}
