package w9;

public class ArrayExample {

	public static void main(String[] args) {
		int[] numbers = {2,2,2,2,2,2,2,2,2};
		int sum = 0;
		Double average;
		
		for (int array_values:numbers) {
			sum+=array_values;
		}
		
		int array_length = numbers.length;
		average = (double)sum/(double)array_length;
		
		System.out.println("Sum of the elements = " + sum);
		System.out.println("Average of the elements = " + average);
	}

}
