class AssOpt{
public static void main(String args[]){
int a=12 ,b=3,sum=0;
  sum += a;
int sub=0,mul=0,mod=0,div=0;
 sub=a-=b;
 mul=a*=b;
 div=a/=b;
 mod=a%=b;
 System.out.println("the output is:" + sum);
System.out.println("the output is:" + sub);
System.out.println("the output is:" + mul);
System.out.println("the output is:" + mod);
System.out.println("the output is:" +div);
//System.out.println(a + " " + b + " " + s);
}
}