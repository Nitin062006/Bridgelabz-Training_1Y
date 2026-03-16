import java.util.*;

class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
			}

        int[] digits = new int[count];

        temp = num;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int largest = digits[0];
        int sLargest = digits[0];
		
		for (int i = 0; i < count; i++) {
            if (digits[i] > largest) {
                sLargest = largest;
                largest = digits[i];
            } else if (digits[i] > sLargest && digits[i] != largest) {
                sLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Slargest digit: " + sLargest);
    }
}