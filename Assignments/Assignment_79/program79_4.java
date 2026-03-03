/*
Assignment 4: Design a Java application to track temperatures across different cities.
- Rows represent Cities.
- Columns represent Days of the week (7 columns).

Requirements:
1. Calculate average temperature for each city.
2. Find the city with the highest recorded temperature.
3. Identify days where the temperature exceeded a threshold (e.g., 40 degrees).
4. Find the overall average temperature of all cities.

Input Format:
- N (Number of Cities)
- Next N lines: 7 integers (daily temperatures)
*/

import java.util.*;

public class program79_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[][] temps = new int[n][7];
        double totalSumAll = 0;
        int maxTemp = Integer.MIN_VALUE;
        int hotCity = 0;

        for (int i = 0; i < n; i++) {
            double citySum = 0;
            for (int j = 0; j < 7; j++) {
                int t = sc.nextInt();
                temps[i][j] = t;
                citySum += t;
                totalSumAll += t;
                if (t > maxTemp) {
                    maxTemp = t;
                    hotCity = i + 1;
                }
            }
            System.out.printf("City %d Average: %.2f\n", (i + 1), (citySum / 7));
        }

        System.out.println("\nHottest City: City " + hotCity + " (Temp: " + maxTemp + ")");
        System.out.printf("Overall Average Temperature: %.2f\n", (totalSumAll / (n * 7)));

        sc.close();
    }
}