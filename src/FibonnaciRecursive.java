public class FibonnaciRecursive {
	int f(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f = f(n - 1) + f(n - 2);
		System.out.print(f + " ");
		return f;
	}
	public static void main(String[] args) {
		FibonnaciRecursive f = new FibonnaciRecursive();
		System.out.println(f.f(11));
	}
}
