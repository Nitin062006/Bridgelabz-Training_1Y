import java.util.Scanner;
class perimeter{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		System.out.println("enter the base");
		int b=sc.nextInt();
		int Perimeter =2*(l+b);
		System.out.println(Perimeter);
	}
}