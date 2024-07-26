package w10;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// Create an array
        int[] numbers = {3, 7, 12, 5, 8, 22, 15};

        // Get the number to search from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int searchNumber = scanner.nextInt();

        // Search the number in the array
        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        // Print the result
        if (found) {
            System.out.println("It is in the array.");
        } else {
            System.out.println("Number is not in the list.");
        }
        scanner.close();
	}

}
