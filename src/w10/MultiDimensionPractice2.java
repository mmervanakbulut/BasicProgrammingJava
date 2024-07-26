package w10;

public class MultiDimensionPractice2 {

	public static void main(String[] args) {
		int number[][] = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				number[i][j] = (int) (Math.random() * 101);
				System.out.print(number[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
