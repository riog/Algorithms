
public class NaiveFibonnaci {

	public static void main(String[] args) {
		System.out.println(fib(10));
	}
	public static int fib(int x) {
		if(x == 1 || x == 0) {
			System.out.println(x);
			return x;
		}
		int res = fib(x-2) + fib(x-1);
		System.out.println(res);
		return res;
	}
	/**
	 * @param x
	 * @return
	 */
	public static int fib2(int x) {
		int a = 0;
		int b = 1;
		int temp = 0;
		for(int i = 0; i < x; i++) {
			temp = a;
			a = b;
			b = temp + b;
			System.out.println(temp);
		}
		return a;
	}
}
