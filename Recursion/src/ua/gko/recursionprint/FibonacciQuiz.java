package ua.gko.recursionprint;

public class FibonacciQuiz {

	public static void main(String[] args) {
		f(5);
	}

	public static int f(int x) {
		System.out.print(" " + x);
		if (x == 0) {
			return 0;
		} else if (x == 1)
			return 1;
		else {
			return f(x - 2) + f(x - 1);
		}
	}
}
