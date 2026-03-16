import java.util.*;
class Subject{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int subject[] = new int[3];
		System.out.println("Enter the phy : ");
		int phy=sc.nextInt();
		System.out.println("Enter the chem : ");
		int chem=sc.nextInt();
		System.out.println("Enter the math : ");
		int math=sc.nextInt();
		double sum=(phy+chem+math)/3;
		if(sum>=90)
		{
			System.out.println("Excellent");
		}
			else if(sum>=80){
				System.out.println("very good");
			}
			else if(sum>=70){
				System.out.println("good");
			}
			else if(sum>=50){
				System.out.println("fair");
			}
			else if(sum>=40){
				System.out.println("need improvement");
			}
	}
}