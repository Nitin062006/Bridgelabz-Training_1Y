import java.util.Scanner;
class Student{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the pens:");
		int pens = sc.nextInt();
		System.out.println("enter the student:");
		int st= sc.nextInt();
		int quotient=pens/st;
		int rem=pens%st;
		System.out.println(quotient);
		System.out.println(rem);
	}
}
		