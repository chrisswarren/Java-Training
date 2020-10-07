package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the last 2 Fibonnaci numbers
		// Fib(0) = 0
		// Fib(1) = 1
		// Fib(2) = Fib(1) + Fib(0) = 1 + 0 = 1
		// Fib(3) = Fib(2) + Fib(1) = 1 + 1 = 2
		// Fib(4) = Fib(3) + Fib(2) = 2 + 1 = 3
		// Fib(5) = Fib(4) + Fib(3) = 3 + 2 = 5
		System.out.println(fib(4));
		
		// Factorial number
		// 1! = 1 * 1 = 1
		// 2! = 2 * 1 = 2
		// 3! = 3 * 2 * 1 = 6
		// 4! = 4 * 3 * 2 * 1 = 24
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		System.out.println(fac(4));
		
		

	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}
	
	public static int fac(int f) {
		if (f == 1) {
			return 1;
		}
		else if (f == 2) {
			return 2;
		}
		return (fac(f-1) * f);
	}

}
