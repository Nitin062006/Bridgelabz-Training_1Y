package com.gla.Methods.Level_3;


class NumberChecker2 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number, sum = 0, temp = square;
        while (temp > 0) { sum += temp % 10; temp /= 10; }
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1, temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sum += d; product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        return String.valueOf(number * number).endsWith(String.valueOf(number));
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        System.out.println("Number\tPrime\tNeon\tSpy\tAutomorphic\tBuzz");
        int[] tests = {7, 9, 1, 13, 5, 132, 25, 17, 14};
        for (int n : tests) {
            System.out.println(n + "\t" + isPrime(n) + "\t" + isNeonNumber(n) + "\t"
                    + isSpyNumber(n) + "\t" + isAutomorphicNumber(n) + "\t\t" + isBuzzNumber(n));
        }
    }
}
