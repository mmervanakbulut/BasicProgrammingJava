package w10;

public class Sometricks {

	public static void main(String[] args) {
		int n1[] = {1,2,3,4,5,6,7,8};
		int n2[] = new int[5];
		int n3[] = new int[n1.length];
		System.arraycopy(n2, 0, n1, 0, 3); 
		// arrayCopy (copy, startingPoint, toWhat, startingPoint, count)
		
		// System.out.println("n2 = ");
		
		System.arraycopy(n1, 3, n3, 1, 4);
		
		for(int numbers: n3) {
			System.out.print(numbers + ", ");
		}
		System.out.println();
		char[] vowels = {'a','b','q','i','e'};
		for ( char items: vowels) {
			System.out.print(items + ", ");
		}
	}

}
