package w10;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		int [][] numbers = {{9,0},{7,8},{5,6},{3,4},{1,2}};
		int i,j;
		for(i = 0; i< 5;i++) {
			for(j = 0; j < 2; j++) {
				System.out.printf("%5d",numbers[i][j]);
			}
			System.out.println();
		}
	}

}
