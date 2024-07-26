package w11;

import java.util.Scanner;

public class Practice2_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Eleman sayısını giriniz: ");
		int count = scan.nextInt();
		int array[] = new int[count + 1];
		
		System.out.print("Elemanları giriniz: ");
		for(int i = 0; i<count;i++) {
			array[i] = scan.nextInt();
		}
		System.out.print("Kaçıncı index'i değiştirmek istiyorsunuz: ");
		int position = scan.nextInt();
		System.out.print("Yeni sayıyı girin: ");
		int yeniSayi = scan.nextInt();
		
		for(int i = count - 1; i>=position; i--) {
			array[i+1] = array[i+1];
		}
		array[position-1] = yeniSayi;
		System.out.print("dizinin son hali");
		for(int i = 0; i<count;i++) {
			System.out.printf("%3d", array[i]);
		}
		
		scan.close();
		
		
		
	}

}
