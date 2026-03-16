import java.util.*;
class Factor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int factor[] = new int[n];
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				factor[count]=i;
				count++;
			}
		}
		System.out.println("factor of " +n+ "are :");
		for(int i=0;i<count;i++){
			System.out.println(factor[i]+" ");
		}
	}
}