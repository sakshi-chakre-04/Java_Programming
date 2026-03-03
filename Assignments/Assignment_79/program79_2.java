/*
Assignment 2: Design a Java application to manage cinema hall seating using a 2D array.
- Rows: seat rows
- Columns: seats in each row
- 0 -> Empty, 1 -> Booked

Requirements:
1. Count total booked seats.
2. Find row with maximum bookings.
3. Check if any row is completely full.
4. Display seat matrix.

Input Format:
- Integer R (rows), Integer C (columns)
- Next R lines: C integers (0 or 1)

Validations:
- R > 0, C > 0
- Matrix values must be 0 or 1 only
*/

import java.util.*;

public class program79_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int r = sc.nextInt();
        if (!sc.hasNextInt()) return;
        int c = sc.nextInt();

        if (r <= 0 || c <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[][] seats = new int[r][c];
        int totalBooked = 0;
        int maxBookingsInRow = -1;
        int rowWithMax = 0;
        boolean fullRowExists = false;

        for (int i = 0; i < r; i++) {
            int rowCount = 0;
            for (int j = 0; j < c; j++) {
                int val = sc.nextInt();
                if (val != 0 && val != 1) {
                    System.out.println("Invalid Input");
                    return;
                }
                seats[i][j] = val;
                if (val == 1) {
                    totalBooked++;
                    rowCount++;
                }
            }
            
            if (rowCount > maxBookingsInRow) {
                maxBookingsInRow = rowCount;
                rowWithMax = i + 1;
            }
            
            if (rowCount == c) {
                fullRowExists = true;
            }
        }

        // Final Output
        System.out.println("Total Booked Seats: " + totalBooked);
        System.out.println("Row With Maximum Bookings: Row " + rowWithMax);
        System.out.println("Full Row Exists: " + (fullRowExists ? "Yes" : "No"));

        sc.close();
    }
}