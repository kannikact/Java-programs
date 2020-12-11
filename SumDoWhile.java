import java.util.Scanner;
public class SumDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int i,count=0;
		System.out.println("enter the n value");
		int n= input.nextInt();
		do
		{
			n=n/10;
			count++;
		}while(n>0);
System.out.println(count);
	}

}
