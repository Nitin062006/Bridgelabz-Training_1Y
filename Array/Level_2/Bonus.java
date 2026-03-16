import java.util.Scanner;

public class Bonus
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] emp = new double[10][2];   
        double[][] result = new double[10][2]; 

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Enter again.");
                i--;   
                continue;
            }

            emp[i][0] = salary;
            emp[i][1] = years;
        }
        for (int i = 0; i < 10; i++) {

            double salary = emp[i][0];
            double years = emp[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;   
            } else {
                bonus = salary * 0.02;   
            }

            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}