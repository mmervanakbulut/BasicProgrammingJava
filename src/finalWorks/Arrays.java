package finalWorks;

public class Arrays {

	public static void main(String[] args) {
		int theNumbers[][] = new int[100][1];
		int count[] = new int[6];
		for (int i : count) {
			count[i] = 0;
		}
		int s = 100;
		
		for (int i = 0; i < s; i++) {
			int random = (int)(Math.random() * 6) + 1;
			for (int j = 0; j < 1; j++) {
				theNumbers[i][j] = random;
			}
		}
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.print(" " + theNumbers[i][j]);
			}
		}
		System.out.println();
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < 1; j++) {
				switch (theNumbers[i][j]) {
				case 1:
					count[0] += 1;
					break;
				case 2:
					count[1] += 1;
					break;
				case 3:
					count[2] +=  1;
					break;
				case 4:
					count[3] +=  1;
					break;
				case 5:
					count[4] +=  1;
					break;
				case 6:
					count[5] += 1;
					break;

				default:
					break;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		
		
	}

}
