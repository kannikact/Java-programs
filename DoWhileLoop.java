
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, n = 123, sum = 0;
		do {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
			// System.out.println(sum);

		} while (n>0);
		System.out.println(sum);

	}

}
