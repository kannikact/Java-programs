
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, space = 4;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
		}
	}
}