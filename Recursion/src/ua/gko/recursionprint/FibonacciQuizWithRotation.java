package ua.gko.recursionprint;

public class FibonacciQuizWithRotation {
	private static int depth = 0;

	public static void main(String[] args) {
		f(5);
	}

	public static int f(int x) {
		in(x);
		int result = check(x);
		out(x);
		return result;
	}

	public static int check(int x) {
		if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else if (x % 2 == 0) {
			return f(x - 2) + f(x - 1);
		} else {
			return f(x - 1) + f(x - 2);
		}
	}

	public static void in(int x) {
		spases();
		System.out.println("(" + x + ")->");
		depth++;
	}

	public static void out(int x) {
		depth--;
	}

	private static void spases() {
		for (int k = 0; k < depth; k++) {
			System.out.print(" ");
		}
	}
}