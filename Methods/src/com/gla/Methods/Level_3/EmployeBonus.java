package com.gla.Methods.Level_3;


class EmployeBonus {
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] empData) {
        double[][] result = new double[empData.length][2];
        for (int i = 0; i < empData.length; i++) {
            double bonusPct = (empData[i][1] > 5) ? 0.05 : 0.02;
            result[i][1] = empData[i][0] * bonusPct;
            result[i][0] = empData[i][0] + result[i][1];
        }
        return result;
    }

    public static void displayResults(int[][] empData, double[][] bonusData) {
        System.out.printf("%-5s %-12s %-8s %-8s %-12s %-12s%n",
                "Emp", "OldSalary", "Years", "Bonus%", "BonusAmt", "NewSalary");
        System.out.println("------------------------------------------------------------");
        double totOld = 0, totNew = 0, totBonus = 0;
        for (int i = 0; i < empData.length; i++) {
            System.out.printf("%-5d %-12d %-8d %-8s %-12.2f %-12.2f%n",
                    (i+1), empData[i][0], empData[i][1],
                    (empData[i][1] > 5 ? "5%" : "2%"), bonusData[i][1], bonusData[i][0]);
            totOld += empData[i][0]; totNew += bonusData[i][0]; totBonus += bonusData[i][1];
        }
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-5s %-12.2f %-8s %-8s %-12.2f %-12.2f%n",
                "TOT", totOld, "", "", totBonus, totNew);
    }

    public static void main(String[] args) {
        System.out.println("=== Zara Company Bonus Report ===\n");
        int[][] empData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(empData);
        displayResults(empData, bonusData);
    }
}
