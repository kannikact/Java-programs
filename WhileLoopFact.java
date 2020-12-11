
public class WhileLoopFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = 1, i = 1, j, n = 5;
		while (i <= n) {

			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}
