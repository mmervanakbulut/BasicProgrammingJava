package homework2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = {"kalem", "elma", "defter", "çanta", "bilgisayar", "kitap", "çeşme", "çatı", "çakmak", "kulaklık", "gözlük", "şişe", "yatak",
				"sandalye", "depo", "bardak", "uygulama", "telefon", "tahta", "tebeşir", "merdiven", "asansör", "koltuk", "süpürge", "kedi", "köpek",
				"devir", "terlik", "anahtar", "ayna", "alçı", "abaküs", "aslan", "açacak", "beyin", "baston", "bilgili", "bencil", "beşik", "ceza", 
				"dernek", "destek", "direk", "deney", "eleman", "eşki", "eski", "eğlence", "etek", "eldiven", "esnek", "eklem", "fes", "fare", "fuar",
				"firar", "gemi", "gazete", "güzel", "hamsi", "hastane", "hakikat", "ıspanak", "ısırmak", "ibadet", "ihsan", "iplik", "iğne", "ifade",
				"ordu", "orta", "örtü", "örtmek", "parmak", "paket", "ramazan", "renk", "resim", "saman", "sevmek", "sıcak", "saygı", "şimşek", 
				"şarkı", "şemsiye", "tekerleme", "tencere", "tırnak", "umut", "uskumru", "üç", "ülke", "ümit", "vasat", "virane", "varmak", "yağmur",
				"yasa", "yaşamak", "zaman", "zeka", "zincir"};
		
		System.out.println(words.length);
		int random = (int) (Math.random() *102);
		
		System.out.println(random);
		
		String kelime = words[random];
		
		System.out.println(kelime);
		System.out.println(kelime.length());
		
		for (int i = 0; i < kelime.length(); i++) {
			System.out.print("_ ");
		}
		
		String tahmin = "";
		System.out.print("Tahmin: ");
		tahmin = scan.next();
		char a;
		for (int i = 0; i < kelime.length(); i++) {
			a = kelime.charAt(i);
			
				for (int j = 0; j < kelime.length(); j++) {
					System.out.print("tahmin doğru");
				}
			
		}
		
		
		
		
		
		
		
		scan.close();
	}

}
