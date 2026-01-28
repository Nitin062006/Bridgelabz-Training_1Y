import java.util.Scanner;
class Multiples{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n =sc.nextInt();
		
		if(n>0 || n<=100){
			System.out.println("positive integer or valid");
		
		for(int i=100;i>=1;i--){
			if(i%n==0){
			System.out.println(i);
			}
		}
		}
	}
}
			