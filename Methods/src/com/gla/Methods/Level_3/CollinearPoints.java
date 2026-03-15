package com.gla.Methods.Level_3;


class CollinearPoints {
    public static boolean areCollinearBySlope(double x1, double y1,
                                              double x2, double y2,
                                              double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double epsilon = 1e-9;
        return Math.abs(slopeAB - slopeBC) < epsilon;
    }

    public static boolean areCollinearByArea(double x1, double y1,
                                             double x2, double y2,
                                             double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        System.out.println("--- A(2,4) B(4,6) C(6,8) ---");
        System.out.println("Collinear by Slope: " + areCollinearBySlope(2,4,4,6,6,8));
        System.out.println("Collinear by Area : " + areCollinearByArea(2,4,4,6,6,8));
        System.out.println("\n--- A(1,1) B(2,3) C(4,5) ---");
        System.out.println("Collinear by Slope: " + areCollinearBySlope(1,1,2,3,4,5));
        System.out.println("Collinear by Area : " + areCollinearByArea(1,1,2,3,4,5));
    }
}
