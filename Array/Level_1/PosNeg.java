import java.util.*;
class PosNeg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		System.out.println("Enter the number :");
		int m=sc.nextInt();
		for(int i=0;i<5;i++){
		if(m>0){
			if(m%2==0){
			System.out.println("Positive and even");
		}
		else{
			System.out.println("Positive and odd");
		}
		}
		else if(m<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
	}
	}
}

