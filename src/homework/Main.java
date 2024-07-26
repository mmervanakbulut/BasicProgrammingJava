package homework;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Bu projede hafıza oyunu yapacağız. Kullanıcı doğru bilirse altoritmayı 
		 * çalıştıracağız. Uygulamada algoritmalar olacak. Bu algoritmalara karşılık gelen
		 * sayıyı ya da sayıya karşılık gelen algoritmayı doğru bilmesi gerekecek.
		 * Derste yaptığımız algoritmaları ve sınava hazırlanırken yaptığım
		 * algoritmaları içerecek.
		 */


		Scanner scan = new Scanner(System.in);
		Algorithims list = new Algorithims();

		String[] myStrings = { "çarpım tablosu", "ikilik sistem", "onluk sistem", "elmas şekli", "z harfi", "v harfi" };

		int i = 1;
		for (String string : myStrings) {
			System.out.printf("%s: %s \n", i, string);
			i++;
		}

//		System.out.println("1: Çarpım Tablosu\n" 
//				+ "2: İkilik Sistem\n" 
//				+ "3: Onluk Sistem\n" 
//				+ "4: Elmas Şekli\n"
//				+ "5: Z Harfi\n" 
//				+ "6: V Harfi");
		
		
		
		
		
		System.out.print("\nKarşılıklı değerleri sakın unutma. 10 saniye bekleyeceğiz. Soru geliyor...\n");
		Thread.sleep(10000);
		System.out.println("Hile yok ama....");

		int random = (int) (Math.random() * 6) + 1;
	
		
		System.out.println(myStrings[random - 1]);
		System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n%s sayısına karşılık gelen algoritma hangisidir? ", random);
		String key1 = scan.nextLine();
		String key = key1.toLowerCase();

		String randomGelenDeger = myStrings[random - 1].trim();
		
		if (key.equals(randomGelenDeger)) { // referans noktası farklı olduğundan false dönüyordu o yüzden equlas ifadesini kullandım.

			switch (myStrings[random - 1]) {
			case "çarpım tablosu": {
				ilkYazi();
				list.multiplicationTable();
				enSonYazi();
				break;
			}
			case "ikilik sistem": {
				ilkYazi();
				list.tenBasedNumToBinaryNum();
				enSonYazi();
				break;
			}
			case "onluk sistem": {
				ilkYazi();
				list.binaryNumToTenBasenNum();
				enSonYazi();
				break;
			}
			case "elmas şekli": {
				ilkYazi();
				list.diamondShape();
				enSonYazi();
				break;
			}
			case "z harfi": {
				ilkYazi();
				list.letterZ();
				enSonYazi();
				break;
			}
			case "v harfi": {
				ilkYazi();
				list.letterV();
				enSonYazi();
				break;
			}
			default:
				System.out.println("Yanlış yazmış olabilir misin?");
			}
		} else {
			System.out.println("giremedik");
		}
		scan.close();
	}
	static void ilkYazi() {
		System.out.println("Hadi algoritmaya bakalım.");
	}
	static void enSonYazi() {
		System.out.println("\nEvet bu kadardı.");
	}

}
