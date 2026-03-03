/*
Assignment 1: Design a Java application that analyzes student performance using a 2D matrix.
- Rows represent students.
- Columns represent subjects.

Requirements:
1. Calculate total marks of each student.
2. Identify the topper (student with highest total).
3. Calculate average marks for each subject.
4. Print students who failed in any subject (marks < 35).

Input Format:
- N (Students), M (Subjects)
- N lines of M integers each.

Validations:
- N > 0, M > 0
- Marks between 0 and 100
*/

import java.util.*;

public class program79_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        if (!sc.hasNextInt()) return;
        int m = sc.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[][] marks = new int[n][m];
        int[] studentTotals = new int[n];
        boolean[] failedStudents = new boolean[n];

        for (int i = 0; i < n; i++) {
            int currentTotal = 0;
            for (int j = 0; j < m; j++) {
                int val = sc.nextInt();
                if (val < 0 || val > 100) {
                    System.out.println("Invalid Input");
                    return;
                }
                marks[i][j] = val;
                currentTotal += val;
                if (val < 35) {
                    failedStudents[i] = true;
                }
            }
            studentTotals[i] = currentTotal;
        }

        // 1. Output Student Totals
        System.out.println("Student Totals:");
        int topperIndex = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentTotals[i]);
            if (studentTotals[i] > studentTotals[topperIndex]) {
                topperIndex = i;
            }
        }

        // 2. Output Topper
        System.out.println("\nTopper: Student " + (topperIndex + 1));

        // 3. Output Subject Averages
        System.out.println("\nSubject Averages:");
        for (int j = 0; j < m; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += marks[i][j];
            }
            System.out.printf("Subject %d: %.2f\n", (j + 1), (sum / n));
        }

        // 4. Output Failed Students
        System.out.println("\nStudents Failed:");
        boolean foundFail = false;
        for (int i = 0; i < n; i++) {
            if (failedStudents[i]) {
                System.out.println("Student " + (i + 1));
                foundFail = true;
            }
        }
        if(!foundFail) System.out.println("None");
        
        sc.close();
    }
}