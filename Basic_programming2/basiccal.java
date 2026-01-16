import java.util.Scanner;
class basiccal{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num1:");
		float num1=sc.nextFloat();
		System.out.println("enter the num2:");
		float num2=sc.nextFloat();
		
		float add = num1+num2;
		float sub = num1 -num2;
		float div = num1/num2;
		float mul = num1*num2;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
		
	sc.close;
	}
}