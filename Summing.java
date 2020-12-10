import java.util.Scanner;
public class Summing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int num2 = sc.nextInt();
		sum(num2);
	}

	static void sum(int n) {
		int  sum = 0, rem = 0;
		while (n > 0) {
			rem = n % 10;
			sum = rem + sum;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
