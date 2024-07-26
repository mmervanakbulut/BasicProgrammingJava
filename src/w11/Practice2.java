package w11;

public class Practice2 {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{3,4,5},{5,6,7},{7,8,9},{9,10,11}};
		int b[] = new int[3];
		int c[] = new int[5];
		int i=0,j =0;
		
		for(i = 0; i<5;i++) {
			for(j = 0; j<3; j++) {
				c[i] += a[i][j];
			}
		}
		for( i = 0; i<3;i++) {
			for( j = 0; j<5; j++) {
				b[i] += a[j][i];
			}
			
		}
		for( i = 0; i<5;i++) {
			for( j = 0; j<3; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.printf("%4d", c[i]  );
			System.out.println();
		}
		for(i =0; i<3; i++) {
			System.out.printf("%4d",b[i]);
		}
		
		
	}

}
