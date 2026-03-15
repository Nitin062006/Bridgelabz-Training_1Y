package com.gla.Methods.Level_3;


class MatrixOperations {
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = (int)(Math.random() * 9) + 1;
        return m;
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) r[i][j] = a[i][j] - b[i][j];
        return r;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int m = a.length, n = a[0].length, p = b[0].length;
        int[][] r = new int[m][p];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < n; k++) r[i][j] += a[i][k] * b[k][j];
        return r;
    }

    public static void displayMatrix(int[][] matrix, String label) {
        System.out.println(label + ":");
        for (int[] row : matrix) {
            for (int val : row) System.out.printf("%4d", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] A = createRandomMatrix(3, 3);
        int[][] B = createRandomMatrix(3, 3);
        displayMatrix(A, "Matrix A");
        displayMatrix(B, "Matrix B");
        displayMatrix(addMatrices(A, B), "A + B");
        displayMatrix(subtractMatrices(A, B), "A - B");
        displayMatrix(multiplyMatrices(A, B), "A * B");
    }
}
