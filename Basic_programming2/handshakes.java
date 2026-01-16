import java.util.Scanner;
class handshakes{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number the students:");
		int S= sc.nextInt();
		
		int h_shakes= (S*(S-1))/2;
		System.out.println("no. of handshakes is:" +h_shakes);
	}
}
