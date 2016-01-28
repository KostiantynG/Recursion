package ua.gko.recursionprint;

public class RecursionPrintIn {

	public static void main(String[] args) {
		f(1);
	}

	public static void f(int x) {
		System.out.println(" " + x);
		if (x < 15) {
			f(2 * x);
		}
	}
}
