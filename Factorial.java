
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				 int num1 = 5;
				findingfactorial(num1);
			}


			static void findingfactorial(int num)
				 {
					 int i=1,fact=1;
					while(i<=num) {
						fact=fact*i;
						i++;
						
					}
					System.out.println(fact);
					
				}
		}

	
