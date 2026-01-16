import java.util.Scanner;
class miles{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the distance in kilometer");
		int d = sc.nextInt();
		
		double miles = d*1.6;
		System.out.println("the distance in miles is:" +miles);
	}
}