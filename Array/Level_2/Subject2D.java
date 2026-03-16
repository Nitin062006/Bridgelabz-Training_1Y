import java.util.*;

class Subject2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        
        int[][] marks = new int[n][3];

        double percentage;

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
			 System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();
        }

        
        System.out.println("\nPhy\tChem\tMaths\tPercentage\tGrade");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
			percentage = total / 3.0;

            System.out.print(
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    String.format("%.2f", percentage) + "\t\t"
            );

            
            if (percentage >= 90)
                System.out.println("A+");
            else if (percentage >= 80)
                System.out.println("A");
            else if (percentage >= 70)
                System.out.println("B");
            else if (percentage >= 60)
                System.out.println("C");
            else if (percentage >= 50)
                System.out.println("D");
            else
                System.out.println("Fail");
        }
    }
}