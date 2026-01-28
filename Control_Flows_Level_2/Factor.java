import java.util.Scanner;
class Comparision{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value ");
		int n =sc.nextInt();
		
		if(n>0){
			System.out.println("factor of "+n+ "are:");
		}
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
	}
}