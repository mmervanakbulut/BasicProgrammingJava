package finalWorks;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// digits: girilen sayının basamak sayısı. 
		// number: girilen sayı, 
		// theDigit: basamak basamak ayırdığımız sayıları tuttuğumuz değişken
		// armstrongNum: hesapladığımız armstrong sayıyı tutyor
		int number, digits = 0, theDigit, armstrongNum = 0;
		
		System.out.println("Is number an armstrong number? ");
		System.out.print("INPUT: ");
		number = scan.nextInt();
		
		// kullanıcıdan aldığımız sayıyı işlemlerde kullanmak için diğer değişkenlere atıyoruz.
		int dSafeNumber = number, aSafeNumber = number;
		
		
		// digits count
		while (dSafeNumber > 0) {
			dSafeNumber = dSafeNumber / 10;
			digits ++;
		}
		
		
		// calculating the armstrong number.
		
		while (aSafeNumber > 0) {
			// basamak basamak sayıları alıyor ve theDigit değişkeninin içine atıyor
			theDigit = aSafeNumber %10;
			// aynı oranda kullanıcıdan alınan sayıyı azaltıyor
			aSafeNumber = aSafeNumber / 10;
			// armstrong sayıyı hesaplıyor
			armstrongNum +=  Math.pow(theDigit, digits) ;
		}
		
		// Conclusion
		if (armstrongNum == number) {
			System.out.printf("Number %s is an armstrong number.", number);
		}else {
			System.out.printf("Number %s is NOT an armstrong number.", number);
		}
		scan.close();
		
	}

}
