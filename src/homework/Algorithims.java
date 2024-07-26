package homework;

import java.util.Scanner;

public class Algorithims {
	
	void multiplicationTable() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen son sayıyı giriniz: ");
		int endPoint = scan.nextInt();
		
		for (int i = 1; i <= endPoint; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%s * %s = %s\t", i, j, i * j);
			}
			System.out.println();
		}
		scan.close();
	}
	
	void tenBasedNumToBinaryNum() {
		Scanner scan = new Scanner(System.in);
		String str = "";
		int c;
		System.out.print("10 tabanlı sayı iki tabanlı sayıya çevrilecek. Lütfen sayıyı giriniz:  ");
		System.out.println();
		int tenBasedNum = scan.nextInt();
		
		while(tenBasedNum>0) {
			c = tenBasedNum%2;
			tenBasedNum = tenBasedNum/2;
			str =  c + " "+ str;
		}
		//for (int i = 0; i < tenBasedNum; i++) {
			//c = tenBasedNum%2;
			//tenBasedNum = tenBasedNum/2;
			//str =  str + " "+ c;
			
		//}
		
		System.out.println(str);
		
		scan.close();
	}
	
	void binaryNumToTenBasenNum() {
		int binaryNum=0, c=0, b = 0, mode = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sadece 0 ve 1 rakamlarını kullanarak binary bir sayı yazınız: ");
		binaryNum = scan.nextInt();
		
		for(int i = binaryNum; i>=0; i--) {
			mode = binaryNum%10;
			binaryNum= binaryNum/10;
			b += mode * (int)(Math.pow(2, c));
			c++;
		}
		System.out.printf("10 tabanında sayı: %s",b);
		scan.close();
	}
	
	
	void diamondShape() {
		Scanner scan = new Scanner(System.in);
		System.out.print("elmas kaç basamaklı olacak: ");
		int v = scan.nextInt();

		for (int i = 1; i <= v; i++) {
			for (int t = i; t < v; t++) {
				System.out.print(" ");
			}

			for (int j = 1; j < i + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int artan = 1;
		for(int i = v -1; i>0; i--) {
			for(int k = 1; k <= artan; k++) {
				System.out.print(" ");
				if(artan == v) {
					break;
				}
			}
			artan++;
			for (int j = 1; j < i + i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
	
	
	void letterZ() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please give length of the letter Z: ");
		int length = scan.nextInt();
		
		
		for(int i = 0; i<length; i++) {
			for(int j = 0; j<length; j++) {
				if(i == 0 || i == length -1 || length - i - 1==j) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		scan.close();
	}
	
	
	void letterV() {
		Scanner scan = new Scanner(System.in);
		System.out.print("v boyut: ");
		int v = scan.nextInt();
		int a = 1;

		for (int i = 1; i <= v; i++) {
			// first spaces
			for(int j = 1; j<i;j++) {
				System.out.print(" ");
			}
			for (int j = a; j < v * 2; j++) {
				if(j==a || j==(v*2)-1) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			a = a+2;
		}
		scan.close();
	}
}
