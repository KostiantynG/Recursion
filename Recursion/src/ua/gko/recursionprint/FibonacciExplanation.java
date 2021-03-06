package ua.gko.recursionprint;

public class FibonacciExplanation {
	private static int depth = 0;

	public static void main(String[] args) {
		f(5);
	}

	public static int f(int x) {
		in(x);
		int result = (x < 2) ? x : f(x - 2) + f(x - 1);
		out(x);
		return result;
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