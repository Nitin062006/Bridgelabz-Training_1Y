import java.util.Scanner;
class Profit{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the costprice");
		int cp =sc.nextInt();
		System.out.println("enter the sp:");
		int sp =sc.nextInt();
		int profit = sp-cp;
	    System.out.println(profit);
		double prp = (profit/cp)*100;
		System.out.println(prp);
	}
}
		