import java.util.Scanner;
class Divisible{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int num= sc.nextInt();
		if(num%5==0){
		System.out.println("divisible");
		}
		else{
		System.out.println("not divisible");
		}
	}
	}