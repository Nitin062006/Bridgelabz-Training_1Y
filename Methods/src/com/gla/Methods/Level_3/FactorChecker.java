package com.gla.Methods.Level_3;


class FactorChecker {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int findGreatestFactor(int[] factors) { return factors[factors.length - 1]; }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest Factor      : " + findGreatestFactor(factors));
        System.out.println("Sum of Factors       : " + sumOfFactors(factors));
        System.out.println("Product of Factors   : " + productOfFactors(factors));
        System.out.printf("Product of Cube      : %.0f%n", productOfCubeOfFactors(factors));
    }
}
