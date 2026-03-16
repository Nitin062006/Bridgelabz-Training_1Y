import java.util.*;

class BMI2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        
        double[][] data = new double[n][3];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " +(i + 1));

            System.out.print("Enter height : ");
            data[i][0] = sc.nextDouble();   
			
			 System.out.print("Enter weight : ");
            data[i][1] = sc.nextDouble();   

            
            data[i][2] = data[i][1] / (data[i][0] * data[i][0]);
        }

        
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.print(data[i][0] + ""+data[i][1] + "\t" +
                  String.format("%.2f", data[i][2]) + "\t"
            );

            
            if (data[i][2] < 18.5)
				System.out.println("Underweight");
            else if (data[i][2] < 25)
                System.out.println("Normal");
            else if (data[i][2] < 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        }
    }
}