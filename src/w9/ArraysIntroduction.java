package w9;

public class ArraysIntroduction {

	public static void main(String[] args) {
		int number[] = new int[10];
		
		int i;
		
		for(i = 0; i<10;i++) {
			number[i] = i*12;
		}
		for(i = 0; i<10;i++) {
			System.out.printf("%d ", number[i]);
		}
		System.out.println();
		for(int a : number) {
			System.out.printf("%d ", a);
		}
	}

}
