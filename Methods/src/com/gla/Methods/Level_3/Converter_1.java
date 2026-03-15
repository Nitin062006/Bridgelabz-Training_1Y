package com.gla.Methods.Level_3;


class Converter_1 {
    public static int countDigits(int number) {
        int count = 0, temp = number;
        while (temp > 0) { count++; temp /= 10; }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) { digits[i] = temp % 10; temp /= 10; }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            reversed[i] = digits[digits.length - 1 - i];
        return reversed;
    }

    public static boolean arraysAreEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysAreEqual(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] testNumbers = {121, 1221, 123, 1023, 12321};
        for (int number : testNumbers) {
            int[] digits = getDigits(number);
            System.out.println("Number: " + number
                    + " | Palindrome: " + isPalindrome(digits)
                    + " | Duck: " + isDuckNumber(digits));
        }
    }
}

