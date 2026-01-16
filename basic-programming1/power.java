import java.util.Scanner;
class power{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		
		
		
		
		double p=Math.pow(a,b);
		
		System.out.println("power is:"+p );
	}
}