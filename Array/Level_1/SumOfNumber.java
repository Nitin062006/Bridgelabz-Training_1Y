import java.util.*;
class SumOfNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		System.out.println("Enter the number :");
		int m=sc.nextInt();
		for(int i=0;i<10;i++){
			System.out.println("Zero and negative number");
		 if(m<=0){
			 break;
		 }
		 int sum=0;
		 for(int j=0;j<m;j++){
			 sum+=j;
			 System.out.println(sum);
		 }
		}
	}
}