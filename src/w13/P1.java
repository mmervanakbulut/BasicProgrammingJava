package w13;

public class P1 {

	public static void main(String[] args) {
		String kelime = "Denizdeki ";
		System.out.printf("kelime : %15s", kelime );
		System.out.println();
		System.out.println(kelime.length());
		String kelime2 = "Denizdeki ";
		if (kelime.equals(kelime2)) {
			System.out.println("Words are same");
		}
	}

}
