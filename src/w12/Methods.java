package w12;

public class Methods {

	public static void main(String[] args) {
		int[] sayilar = {1,2};
		for(int sayi: sayilar) {
			System.out.println(sayi);
		}
		arrayChange(sayilar);
		
		for(int sayi: sayilar) {
			System.out.println(sayi);
		}
		
	}
	public static void arrayChange(int[] sayilar) {
		int a = 0;
		a = sayilar[0];
		sayilar[0] = sayilar[1];
		sayilar[1] = a;
		
	}

}
