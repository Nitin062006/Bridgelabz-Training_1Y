import java.util.Scanner;
class Comparision{
	public static void main(String []args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value ");
		int n =sc.nextInt();
		
		int i=1;
		if(n>0){
		System.out.println("positive integer"+n);}
			
		while(i<=n){
		    if(n%i==0){
				System.out.println(i);
			}
			i++;
		}
		
	}
}