import java.util.Scanner;
class Check_Naturalno{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num :");
		int n= sc.nextInt();
		int sum=0;
		
		if(n>0){
		for(int i=1;i<=n;i++){
		sum=sum+i;
		System.out.println(" sum of "+n+" natural number is:" +sum);
		}
		}
		else{
			System.out.println("not a natural no.");
		}
	}
	}
