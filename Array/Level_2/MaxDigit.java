import java.util.*;

class MaxDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 10;              
        int[] arr = new int[maxDigit];
        int index = 0;

        while (num > 0) {
		
		if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];

               
                for (int i = 0; i < arr.length; i++) {
                    temp[i] = arr[i];
                }
                arr = temp;
            }

            arr[index] = num % 10;
            index++;
            num = num / 10;
        }
		int largest = -1;
        int sLargest = -1;

        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Slargest digit: " + sLargest);
    }
}