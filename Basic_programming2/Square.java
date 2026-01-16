import java.util.Scanner;
class Square{
	public static void msin(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the parameter:");
		int para = sc.nextInt();
		
		int side = para/4;
		System.out.println("side of the square is:" +side);
	}
}
		