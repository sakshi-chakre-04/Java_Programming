/*
Question 2: Design a Java program to determine whether a given square matrix is a Magic Square.
A Magic Square is defined as:
- All row sums are equal.
- All column sums are equal.
- Both diagonal sums are equal.
Input Format:
- First line: Integer N (size of square matrix)
- Next N lines: N integers each
Validations:
- N > 0
- Matrix must be square
*/

import java.util.Scanner;

public class program80_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input: N must be > 0");
            return;
        }

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if (isMagicSquare(matrix, n)) {
            System.out.println("Matrix is a Magic Square");
        } else {
            System.out.println("Matrix is NOT a Magic Square");
        }
    }

    public static boolean isMagicSquare(int[][] mat, int n) {
        // Calculate sum of first row as reference
        int targetSum = 0;
        for (int j = 0; j < n; j++) targetSum += mat[0][j];

        // Check rows
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) rowSum += mat[i][j];
            if (rowSum != targetSum) return false;
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) colSum += mat[i][j];
            if (colSum != targetSum) return false;
        }

        // Check primary diagonal
        int diag1 = 0;
        for (int i = 0; i < n; i++) diag1 += mat[i][i];
        if (diag1 != targetSum) return false;

        // Check secondary diagonal
        int diag2 = 0;
        for (int i = 0; i < n; i++) diag2 += mat[i][n - 1 - i];
        if (diag2 != targetSum) return false;

        return true;
    }
}