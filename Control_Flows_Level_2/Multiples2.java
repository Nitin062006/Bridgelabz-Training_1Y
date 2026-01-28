import java.util.Scanner;
class Multiples{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n =sc.nextInt();
		
		int i=100;
		while(i>=1){
			if(i%n==0){
		System.out.println(i);}
		i--;
		}
	}
}