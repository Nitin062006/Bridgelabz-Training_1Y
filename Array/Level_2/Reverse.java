import java.util.*;
class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int reverse[] = new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			reverse[count]=i;
			count++;
		}
		System.out.println("Reverse the number :");
		for(int i=count-1;i>0;i--){
			System.out.println(reverse[i]);
		}
	}
}