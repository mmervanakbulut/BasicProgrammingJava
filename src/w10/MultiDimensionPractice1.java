package w10;

import java.util.Scanner;

public class MultiDimensionPractice1 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int [][] numbers = {{1,2},{3,4},{5,6}};
		System.out.print("Number: ");
		int number = scan.nextInt();
		int i,j;
		for(i = 0; i< 3;i++) {
			for(j = 0; j < 2; j++) {
				if(number == numbers[i][j]) {
					System.out.printf("%s index number %s and %s",number,i,j);
				}
			}
		}
		
	}

}
