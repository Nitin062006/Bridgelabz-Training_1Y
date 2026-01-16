import java.util.Scanner;
class simpleinterest{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle");
		
		int p=sc.nextInt();
		System.out.println("enter the rate");
		int r=sc.nextInt();
	    System.out.println("enter the time");
		
		
		int t=sc.nextInt();
		int principle =p*r*t/100;
		System.out.println(principle);
}}