import java.util.Scanner;
class operator{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the num1");
	int num1 = sc.nextInt();
	System.out.println("enter the num2:");
	int num2 = sc.nextInt();
	
	int rem,qutnt;
	rem =num1%num2;
	qutnt = num1/num2;
	
	System.out.println(rem);
	System.out.println(qutnt);
}
}
