import java.util.*;
class Table{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		System.out.println("Enter the number :");
		int m=sc.nextInt();
		for(int i=1;i<=10;i++){
			 num[i]=m*i;
			
			System.out.println(m+ "*" +i+ "=" +num[i]);
		}
	}
}