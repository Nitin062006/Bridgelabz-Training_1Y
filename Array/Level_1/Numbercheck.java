import java.util.Scanner;
class Numbercheck
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is Positive and Even");
                } else {
                    System.out.println(num[i] + " is Positive and Odd");
                }
            } 
            else if (num[i] < 0) {
                System.out.println(num[i] + " is Negative");
            } 
            else {
                System.out.println(num[i] + " is Zero");
            }
        }
        if (num[0] == num[4]) {
            System.out.println("First and Last numbers are Equal");
        } 
        else if (num[0] > num[4]) {
            System.out.println("First number is Greater than Last number");
        } 
        else {
            System.out.println("First number is Less than Last number");
        }
    }
}