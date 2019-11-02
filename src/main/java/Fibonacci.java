package main.java;

public class Fibonacci {

	public static int iteraticeFibonacci(int number) {

		int twonumbersDown = 0;
		int onenumberDown = 0;
		int currentNumber = 1;

		if (number == 0) {
			return 0;
		}

		for (int i = 1; i < number; i++) {
			twonumbersDown = onenumberDown;
			onenumberDown = currentNumber;
			currentNumber = twonumbersDown + onenumberDown;
		}

		return currentNumber;
	}

	public static int recursiveFibonacci(int number) {

		if (number <= 1) {
			return number;
		}

		return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
	}

	public static void main(String args[]) {

		// Iterative
		System.out.println(iteraticeFibonacci(0)); // prints 0
		System.out.println(iteraticeFibonacci(1)); // prints 1
		System.out.println(iteraticeFibonacci(7)); // prints 13
		System.out.println(iteraticeFibonacci(10)); // prints 55
		System.out.println(iteraticeFibonacci(20)); // prints 6765
		System.out.println(iteraticeFibonacci(40)); // prints 102334155

		// Recursive
		System.out.println(recursiveFibonacci(0)); // prints 0
		System.out.println(recursiveFibonacci(1)); // prints 1
		System.out.println(recursiveFibonacci(7)); // prints 13
		System.out.println(recursiveFibonacci(10)); // prints 55
		System.out.println(recursiveFibonacci(20)); // prints 6765
		System.out.println(recursiveFibonacci(40)); // prints 102334155

	}

}
