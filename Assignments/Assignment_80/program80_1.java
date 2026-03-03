/*
Question 1: Design a Java application to analyze electricity consumption of multiple cities over a week.
- Rows represent cities.
- Columns represent 7 days of the week.
- Each cell contains units consumed on that day.
Requirements:
1. Calculate total weekly consumption for each city.
2. Identify city with highest consumption.
3. Identify the day with maximum overall consumption.
4. Print cities that consumed more than 500 units in a week.
*/

import java.util.Scanner;

public class program80_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of cities
        System.out.print("Enter number of cities (N > 0): ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input: N must be greater than 0.");
            return;
        }

        int[][] consumption = new int[n][7];
        int[] weeklyTotals = new int[n];
        int[] dailyTotals = new int[7];

        // Input: Daily units for each city
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 7; j++) {
                int units = sc.nextInt();
                if (units < 0) {
                    System.out.println("Invalid input: Units cannot be negative.");
                    return;
                }
                consumption[i][j] = units;
                weeklyTotals[i] += units;
                dailyTotals[j] += units;
            }
        }

        // Processing Logic
        int maxWeekly = -1;
        int highestCityIndex = 0;
        for (int i = 0; i < n; i++) {
            if (weeklyTotals[i] > maxWeekly) {
                maxWeekly = weeklyTotals[i];
                highestCityIndex = i + 1;
            }
        }

        int maxDaily = -1;
        int peakDayIndex = 0;
        for (int j = 0; j < 7; j++) {
            if (dailyTotals[j] > maxDaily) {
                maxDaily = dailyTotals[j];
                peakDayIndex = j + 1;
            }
        }

        // Final Output
        System.out.println("\nWeekly Consumption:");
        for (int i = 0; i < n; i++) {
            System.out.println("City " + (i + 1) + ": " + weeklyTotals[i]);
        }

        System.out.println("\nHighest Consumption: City " + highestCityIndex);
        System.out.println("Peak Consumption Day: Day " + peakDayIndex);

        System.out.println("\nCities with > 500 units:");
        for (int i = 0; i < n; i++) {
            if (weeklyTotals[i] > 500) {
                System.out.println("City " + (i + 1));
            }
        }
    }
}