import java.util.Scanner;
class check_number{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int num= sc.nextInt();
		if(num>0){
		System.out.println("positive");
		}
		else{
		System.out.println("negative");
		}
	}
	}