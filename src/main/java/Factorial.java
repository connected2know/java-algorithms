package main.java;

public class Factorial {

	public static double iterativeFactorial(int number) { // we return double because this type can hold very large
															// numbers. Integer range is smaller so, when calculating
															// the factorial of big numbers, we could easily go out of
															// range using int

		double result = 1;
		
		if (number == 0 || number == 1) {
			return result;
		}
		
		for (double i = 1; i <= number; i++) {
			result = result * i;
		}

		return result;
	}

	public static double recursiveFactorial(int number) { // we return double because this type can hold very large
															// numbers. Integer range is smaller so, when calculating
															// the factorial of big numbers, we could easily go out of
															// range using int

		if (number == 0 || number == 1) {
			return 1;
		}
		
		return number * (recursiveFactorial(number - 1));
	}

	public static void main(String[] args) {
		// Iterative
		System.out.println(iterativeFactorial(0)); // prints the value 1.0
		System.out.println(iterativeFactorial(1)); // prints the value 1.0
		System.out.println(iterativeFactorial(4)); // prints the value 24.0
		System.out.println(iterativeFactorial(6)); // prints the value 720.0
		System.out.println(iterativeFactorial(10)); // prints the value 3628800.0
		System.out.println(iterativeFactorial(14)); // prints the value 8.71782912E10
		System.out.println(iterativeFactorial(17)); // prints the value 3.55687428096E14

		// Recursive
		System.out.println(recursiveFactorial(0)); // prints the value 1.0
		System.out.println(recursiveFactorial(1)); // prints the value 1.0
		System.out.println(recursiveFactorial(4)); // prints the value 24.0
		System.out.println(recursiveFactorial(6)); // prints the value 720.0
		System.out.println(recursiveFactorial(10)); // prints the value 3628800.0
		System.out.println(recursiveFactorial(14)); // prints the value 8.71782912E10
		System.out.println(recursiveFactorial(17)); // prints the value 3.55687428096E14
	}

}
