import java.util.Scanner;
class Smallest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num a:");
		int a= sc.nextInt();
		System.out.println("enter the num b:");
		int b=sc.nextInt();
		System.out.println("enter the num c:");
		int c=sc.nextInt();
		if(a<b&&b<c){
		System.out.println("a is smallest");
		}
		else if(b<a&&b<c){ 
		System.out.println("b is smallest");
		}
		else{
			System.out.println("c is smallest");
		}
	}
	}