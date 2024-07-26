package w13;

public class P3 {

	public static void main(String[] args) {
		String st1 = "Anadolu";
		int i = 0;
		 System.out.println("Character" + "    " + "Index No");
		 
		 for (i = 0; i < st1.length(); i++) {
			System.out.println(st1.charAt(i)+"\t\t"+st1.indexOf(st1.charAt(i)));
		}
		 
		 String st2[] = {"Ankara", "Hatay", "Antalya", "İstanbul", "Anadolu"};
		 
		 
		 
		 for (i = 0;i  < st2.length; i++) {
			
			if (st2[i].startsWith("An")) {
				System.out.printf("%s start with -an-\n", st2[i]);
				
			}
		}
		 
	}

}
