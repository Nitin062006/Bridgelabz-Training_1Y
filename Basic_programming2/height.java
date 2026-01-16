import java.util.Scanner;
class height{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the height");
		float h=sc.nextFloat();
		double hinch = h*1/2.54;
		double hfeet =hinch/12;
		System.out.println("height in inch is:" +hinch);
		System.out.println("height in feet:" +hfeet);
	}
}