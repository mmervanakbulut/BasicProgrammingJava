package w10;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		String[] name = new String[5];
		
		int i;
		Scanner scan = new Scanner(System.in);
		for(i=0;i<5;i++) {
			System.out.printf("Name %d:", i+1);
			name[i]=scan.next();
			
		}
		
		for(i=0;i<5;i++) {
			System.out.printf("Name: %s",name[i]);
			System.out.println();
		}
		
	}

}
