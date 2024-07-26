package w11;

import java.util.Scanner;

public class Practice2_2 {

	public static void main(String[] args) {
		int column, row, i = 0, j = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of columns of matrix: ");
		column = scan.nextInt();
		System.out.print("Enter the column of row of matrix: ");
		row = scan.nextInt();
		int[][] matrix = new int[row][column];
		int[][] transpose = new int[column][row];
		
		System.out.println("Enter the elements of the matrix:");
		for(i = 0; i<row;i++) {
			for(j=0;j<column;j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		for(i = 0; i<row;i++) {
			for(j=0;j<column;j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		for(i = 0; i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.printf("%3d",matrix[i][j]);
			}
			System.out.println();
		}
		for(i = 0; i<column;i++) {
			for(j=0;j<row;j++) {
				System.out.printf("%3d",transpose[i][j]);
			}
			System.out.println();
		}
	}

}
