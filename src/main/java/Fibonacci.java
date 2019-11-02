package main.java;

public class Fibonacci {

	public static int iteraticeFibonacci(int number) {

		int twonumbersDown = 0;
		int onenumberDown = 0;
		int currentNumber = 1;

		System.out.println(onenumberDown);
		System.out.println(currentNumber);
		
		if (number == 0) {
			return 0;
		}

		for (int i = 1; i < number; i++) {
			twonumbersDown = onenumberDown;
			onenumberDown = currentNumber;
			currentNumber = twonumbersDown + onenumberDown;
			System.out.println(currentNumber);
		}
		return currentNumber;
	}

	
	public static int recursiveFibonacci(int number) {

		
		if (number <= 1) {
			return number;
		}
		
		int result = recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
		return result;
	}
	
	public static void printFibonacciRecursive(int number) {
		for(int i = 0; i <= number; i++) {
			System.out.println(recursiveFibonacci(i));
		}
	}

	public static void main(String args[]) {

		// Iterative
		iteraticeFibonacci(0); // prints 0
		iteraticeFibonacci(1); // prints 0, 1
		iteraticeFibonacci(7); // prints 0, 1, 1, 2, 3, 5, 8, 13
		iteraticeFibonacci(10); // prints 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		iteraticeFibonacci(20); // prints 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765

		// Recursive
		printFibonacciRecursive(0); // prints 0
		printFibonacciRecursive(1); // prints 0, 1
		printFibonacciRecursive(7); // prints 0, 1, 1, 2, 3, 5, 8, 13
		printFibonacciRecursive(10); // prints 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		printFibonacciRecursive(20); // prints 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765

	}

}
