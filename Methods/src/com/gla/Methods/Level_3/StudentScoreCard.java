package com.gla.Methods.Level_3;


class StudentScoreCard {
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int)(Math.random() * 100) + 1;
            scores[i][1] = (int)(Math.random() * 100) + 1;
            scores[i][2] = (int)(Math.random() * 100) + 1;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            results[i][0] = total;
            results[i][1] = Math.round((double) total / 3 * 100.0) / 100.0;
            results[i][2] = Math.round((double) total / 300 * 100 * 100.0) / 100.0;
        }
        return results;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%-4s\t%-5s\t%-5s\t%-5s\t%-6s\t%-8s\t%-10s\t%-5s%n",
                "No", "Phy", "Chem", "Math", "Total", "Average", "Percent", "Grade");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-4d\t%-5d\t%-5d\t%-5d\t%-6.0f\t%-8.2f\t%-10.2f\t%-5s%n",
                    (i+1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], getGrade(results[i][2]));
        }
    }

    public static void main(String[] args) {
        int numStudents = 5;
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
