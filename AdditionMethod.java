
public class AdditionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArthamaticAddition summing=new ArthamaticAddition();
		
summing.sum();
int a=1,b=1;
int res=summing.sum(a, b);
System.out.println("the addition of two int value is:"   +res);
	
double l=2.12,w=3.12;
double res1=summing.sum( l,w);
System.out.println("the addtion of two double value is:"  + res1);

	
}

}
