package finalWorks;

public class RecursiveFunctionExams {

	public static void main(String[] args) {
		f2xFunction(4);
	}

	static void f2xFunction(int num) {
		num = num *2;
		if (num<25) {
			f2xFunction(num);
		}else {
			System.out.println(num);
		}
	}
}
