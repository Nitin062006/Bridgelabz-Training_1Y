import java.util.*;
class Player{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double num[] = new double[11];
		System.out.println("Enter the number of players");
		double n=sc.nextDouble();
		double sum=0;
		 double height=sc.nextDouble();
         for(int i=0;i<11;i++){
			 sum+=height;
		 }
			 double mean = sum/n;
			 System.out.println(mean);
		 }
	}