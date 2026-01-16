import java.util.Scanner;
class Areaofcircle{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the radius");
		int r=sc.nextInt();
		System.out.println("enter teh value");
		
		float a =sc.nextFloat();
		float area =a*r*r;
		System.out.println("Areaof circle:" +area);
	}
}