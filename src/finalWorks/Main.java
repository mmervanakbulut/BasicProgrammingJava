package finalWorks;

public class Main {

	public static void main(String[] args) {
		// Hello and count number
		p();
		// factorial calculation
		System.out.print(factorial(6));
		// 
		int count = 15;
		System.out.print(n1 + " " + n2);// printing 0 and 1
		printFibo(count - 2);// n-2 because 2 numbers are already printed
	}

	// Hello and count number
	static int count = 0;
	static void p() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			p();
		}
	}

	// factorial calculation
	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	// 
	static int n1 = 0, n2 = 1, n3 = 0;
	static void printFibo(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibo(count - 1);
		}
	}

}
