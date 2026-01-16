import java.util.Scanner;
class Fahrenite{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of c");
		
		int c=sc.nextInt();
		int f =(c*9/8)+32;
		System.out.println("Fahranite is:" +f);
	}
}
