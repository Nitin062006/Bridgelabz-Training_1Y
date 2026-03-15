package com.gla.Methods.Level_3;


class LineCalculator {
    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        System.out.println("Points: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")");
        System.out.printf("Euclidean Distance: %.4f%n", findEuclideanDistance(x1, y1, x2, y2));
        double[] eq = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Slope (m): %.4f | Y-Intercept (b): %.4f%n", eq[0], eq[1]);
        System.out.printf("Line Equation: y = %.4fx + %.4f%n", eq[0], eq[1]);
    }
}
