package w10;

public class MultiDimensionPractice3 {

	public static void main(String[] args) {
		int number[][] = new int[6][3];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				number[i][j] = (int) (Math.random() * 11);
				System.out.print(number[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
