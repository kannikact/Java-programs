
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9, count = 0;
		for (int i = 1; i <= 10; i++) {
			if (a % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("prime no");
		} else {
			System.out.println("not prime no");
		}

	}

}
