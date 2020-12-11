
public class SimTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sim simuser = new Sim();
System.out.println("the name is:"+ simuser.name);
System.out.println("the amount is:"+simuser.price);
System.out.println("the network is:"+ simuser.network);

System.out.println("=============");
	
	Sim simuser1 = new Sim("vi",333," 4g");
	System.out.println("the name is:"+ simuser1.name);
	System.out.println("the amount is:"+simuser1.price);
	System.out.println("the network is:"+ simuser1.network);

	
	}
}
 