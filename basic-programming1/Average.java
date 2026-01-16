import java.util.Scanner;
class Average{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number1:");
		int a =sc.nextInt();
		System.out.println("enter the number2:");
		int b =sc.nextInt();
		System.out.println("enter the number3");
		int c =sc.nextInt();
		
		float d=(a+b+c)/3;
		System.out.println("average is:" +d);
	}
}