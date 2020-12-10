
public class NoOfDigits {

	public static void main(String[] args) {  
		// TODO Auto-gene

		int n2=12334;
		findingdigits(n2);
	}
	static void findingdigits(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("the no is" +" " + count  +"  "+ "digit");
	}

}
