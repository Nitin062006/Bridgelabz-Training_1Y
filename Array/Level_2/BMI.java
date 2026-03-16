import java.util.*;
class BMI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of person : ");
		int n=sc.nextInt();
		double weight[] = new double[n];
		double height[] = new double[n];
		double Bmi[] = new double[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the weight");
			 weight[i]=sc.nextDouble();
			System.out.println("Enter the height");
			 height[i]=sc.nextDouble();
		}
			for(int i=0;i<n;i++){
			 Bmi[i]=weight[i]/(height[i]*height[i]);
			System.out.println(Bmi[i]);
			if(Bmi[i]<18.5){
				System.out.println("UNDER WEIGHT");
		}
		    else if(Bmi[i]>=18.5 && Bmi[i]<=24.9){
			    System.out.println("Normal");
		}
		    else if(Bmi[i]>=25.0 && Bmi[i]<=29.9){
			    System.out.println("Overweight");
		}   else{
			    System.out.println("obese");
		}
		}
	}
}