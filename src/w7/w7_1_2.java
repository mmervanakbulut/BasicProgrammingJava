package w7;


public class w7_1_2 {

	public static void main(String[] args) {

		int[] counter = new int[6];

		int[] zar = new int[7];
		for (int i = 0; i < 1000; i++)
			zar[(int) (Math.random() * 6) + 1]++;
		for(int i=1;i<7;i++)
			System.out.printf("%d face count = %d \n",i,zar[i]);
		
		for (int i = 1; i <= 1000; i++) {
			int faces = (int) (Math.random() * 6) + 1;
			if (faces == 1) {
				counter[0] += 1;
			} else if (faces == 2) {
				counter[1] += 1;
			} else if (faces == 3) {
				counter[2] += 1;
			} else if (faces == 4) {
				counter[3] += 1;
			} else if (faces == 5) {
				counter[4] += 1;
			} else if (faces == 6) {
				counter[5] += 1;
			}
		}

		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + " Face count = " + counter[i]);
		}
		System.out.println(counter[0] + counter[1] + counter[2] + counter[3] + counter[4] + counter[5]);
	}

}
