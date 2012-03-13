
public class PolynomialFibonnaci {

	public static void main(String[] args) {
		PolynomialFibonnaci fb = new PolynomialFibonnaci();
		fb.fib(13);
	}
	int fib(int n) {
		if(n == 0) {
			return 0;
		}
		int[] f = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		
		System.out.print("0 1 ");
		
		for(int i = 2; i <= n; i++) {
			f[i] = f[i-2] + f[i-1];
			System.out.print(f[i] + " ");
		}
		
		return f[n];
	}
}
