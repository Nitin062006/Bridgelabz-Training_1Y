import java.util.Scanner;
class power{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a");
		int a =sc.nextInt();
		System.out.println("enter the value of b:");
		int b= sc.nextInt();
		
		int result =1;
		
		for(int i=1;i<=b;i++){
			result*=a;
			System.out.println(result);
		}
		
	}
}
