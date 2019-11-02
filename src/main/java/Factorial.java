package main.java;

public class Factorial {

	public static double iterativeFactorial(int number) { // we return double because this type can hold very large
															// numbers. Integer range is smaller so, when calculating
															// the factorial of big numbers, we could easily go out of
															// range using int

		double result = 1;
		for (double i = 1; i <= number; i++) {
			result = result * i;
		}

		return result;
	}

	public static double recursiveFactorial(int number) { // we return double because this type can hold very large
															// numbers. Integer range is smaller so, when calculating
															// the factorial of big numbers, we could easily go out of
															// range using int

		if (number == 1) {
			return 1;
		}
		
		return number * (recursiveFactorial(number - 1));
	}

	public static void main(String[] args) {
		// Iterative
		System.out.println(iterativeFactorial(1)); // prints 1.0
		System.out.println(iterativeFactorial(4)); // prints 24.0
		System.out.println(iterativeFactorial(6)); // prints 720.0
		System.out.println(iterativeFactorial(10)); // prints 3628800.0
		System.out.println(iterativeFactorial(14)); // prints 8.71782912E10
		System.out.println(iterativeFactorial(17)); // prints 3.55687428096E14

		// Recursive
		System.out.println(recursiveFactorial(1)); // prints 1.0
		System.out.println(recursiveFactorial(4)); // prints 24.0
		System.out.println(recursiveFactorial(6)); // prints 720.0
		System.out.println(recursiveFactorial(10)); // prints 3628800.0
		System.out.println(recursiveFactorial(14)); // prints 8.71782912E10
		System.out.println(recursiveFactorial(17)); // prints 3.55687428096E14
	}

}
