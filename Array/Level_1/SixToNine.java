import java.util.*;
class SixToNine{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		System.out.println("Enter the number :");
		int m=sc.nextInt();
		if(m>=6 && m<=9){
			for(int j=1;j<=10;j++){
				   num[j]=m*j;
				System.out.println(m+ "*" +j+ "=" +num[j]);
			}
		}
	}
}