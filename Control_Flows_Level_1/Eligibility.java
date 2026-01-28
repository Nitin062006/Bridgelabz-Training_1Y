import java.util.Scanner;
class Eligibility{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		int age= sc.nextInt();
		if(age>=18){
		System.out.println("eligible to vote");
		}
		else{
		System.out.println("note eligible to vote");
		}
	}
	}