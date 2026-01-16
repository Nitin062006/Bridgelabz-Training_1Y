import java.util.Scanner;
class discout{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the student fee");
		int fee=sc.nextInt();
		System.out.println("enter the discout per.");
		double dis_p = sc.nextInt();
		double da=(dis_p/100)*fee;
		double dp=fee-dis_p;
		System.out.println(da);
		System.out.println(dp);
	}
}
