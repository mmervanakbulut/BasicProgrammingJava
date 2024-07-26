package w11;

public class Practice1 {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{7,8,9},{10,11,12}};
		int c[][] = new int[2][3];
		
		System.out.println("c matrisi");
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf("%4d",c[i][j]);
			}
			System.out.println();
		}
		
	}

}
