
public class SubtractionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArthmaticSubtraction differance=new ArthmaticSubtraction();
		
		
		differance.sub();
		int a=1,b=1;
		int res=differance.sub(a, b);
		System.out.println("the differance of two int value is:"   +res);
			
		double l=2.12,w=3.12;
		double res1=differance.sub( l,w);
		System.out.println("the addtion of two double value is:"  + res1);

			
	}

}
