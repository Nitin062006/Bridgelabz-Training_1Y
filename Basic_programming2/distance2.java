import java.util.Scanner;
class distance2{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the distance:");
	int d =sc.nextInt();
	float yard =3*d;
	float miles = 1760*yard;
	
	System.out.println("distance in yard is:" +yard);
	System.out.println("distace in miles is:" +miles);
	}
}
	