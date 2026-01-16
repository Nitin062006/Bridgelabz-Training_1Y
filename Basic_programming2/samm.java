import java.util.Scanner;
class Harry{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dob:");marks:");
		int m =sc.nextInt();
		System.out.println("enter the physics marks:");
		int p = sc.nextInt();
		System.out.println("enter the chemistry marks:");
		int c =sc.nextInt();
		
		int avg =(m+p+c)/3;
		System.out.println(avg);
	}
}