import java.util.Scanner;
class triangle{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:");
		int h = sc.nextInt();
		System.out.println("enter the base");
		int b= sc.nextInt();
		
		float sqinches = (0.5f)*b*h;
		float sqfeet = sqinches*6.4516f;
		System.out.println("in sqinches is:" +sqinches);
		System.out.println("in sqfeet is:" +sqfeet);
	}
}