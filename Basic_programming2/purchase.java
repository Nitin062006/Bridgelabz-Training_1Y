import java.util.Scanner;
class purchase{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the unit price:");
		int u_price = sc.nextInt();
		System.out.println("enter the quantity:");
		float qua = sc.nextFloat();
		
		float totalp = u_price*qua;
		System.out.println("total price is:" +totalp);
	}
}
	