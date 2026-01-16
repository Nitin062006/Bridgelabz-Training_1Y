import java.util.Scanner;
class volume{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the radius of earth:");
		int rad=sc.nextInt();
		float pi = 3.14f;
		
		double v =(4/3)*pi*rad*rad*rad;
		double volume = v*v*v;
	double m =volume*1.6;
	double miles=m*m*m;
		
		System.out.println("Volume of Earth is:" +volume);
		System.out.println("miles is:" +miles);
	}
}
