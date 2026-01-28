import java.util.Scanner;
class GreatestFactor{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number: ");
		int n =sc.nextInt();
		int GreatestFactor =1;
		 
		 for(int i=n-1;i>=1;i--){
			 if(n%i==0){
				 System.out.println("GreatestFactor" +i);
				 break;
			 }
			 
		 }
	}
}