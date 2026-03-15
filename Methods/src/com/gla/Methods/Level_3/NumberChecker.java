package com.gla.Methods.Level_3;


//Extend or Create a NumberChecker utility class and perform following task. Call from
//main() method the different methods and display results. Make sure all are static methods
//Hint =>
//a. Method to Find the count of digits in the number
//b. Method to Store the digits of the number in a digits array
//c. Method to Check if a number is a duck number using the digits array. A duck number is a
//number that has a non-zero digit present in it
//d. Method to check if the number is a armstrong number using the digits array. Armstrong
//number is a number that is equal to the sum of its own digits raised to the power of the
//number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
//e. Method to find the largest and second largest elements in the digits array. Use
//Integer.MIN_VALUE to initialize the variable.
//f. Method to find the the smallest and second smallest elements in the digits array. Use
//Integer.MAX_VALUE to initialize the variable.

class NumberChecker {
    public static int countDigits(int number) {
        int count = 0, temp = number;
        while (temp > 0) { count++; temp /= 10; }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int n = digits.length, sum = 0;
        for (int d : digits) sum += (int) Math.pow(d, n);
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) { secondLargest = largest; largest = d; }
            else if (d > secondLargest && d != largest) secondLargest = d;
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) { secondSmallest = smallest; smallest = d; }
            else if (d < secondSmallest && d != smallest) secondSmallest = d;
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        int[] digits = getDigits(number);
        System.out.println("Is Duck Number     : " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));
        int[] lp = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + lp[0] + ", Second Largest: " + lp[1]);
        int[] sp = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + sp[0] + ", Second Smallest: " + sp[1]);
    }
}
