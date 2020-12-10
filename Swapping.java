
public class Swapping {

	public static void main(String[] args) {
		int a1 = 2, b1 = 3;
		swapping(a1, b1);
	}

	// TODO Auto-generated method stub
	static void swapping(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println(+a + " " + b);

	}

}
