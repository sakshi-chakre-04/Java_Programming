/*
 * Assignment 4 (Fitness App):
 * A fitness app records steps for 7 days. It wants to show how many days 
 * user achieved the goal and what the highest step count was.
 * * Input: 
 * - 7 integers (steps)
 * * Validations: 
 * - Steps must be >= 0
 * * Expected Output:
 * Goal Achieved Days: <count>
 * Maximum Steps in Week: <value>
 */

import java.util.Scanner;

public class program78_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int[] steps = new int[7];
        
        // Defining a standard goal (e.g., 5000 steps) 
        // as the requirement asks for "Goal Achieved Days"
        int dailyGoal = 5000; 
        int goalCount = 0;
        int maxSteps = 0;

        System.out.println("Enter step counts for 7 days:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            steps[i] = sobj.nextInt();

            // Validation: Steps must be non-negative
            if (steps[i] < 0) {
                System.out.println("Invalid input. Steps must be >= 0. Please restart.");
                return;
            }

            // Check if goal is achieved
            if (steps[i] >= dailyGoal) {
                goalCount++;
            }

            // Track maximum steps
            if (steps[i] > maxSteps) {
                maxSteps = steps[i];
            }
        }

        System.out.println("\n--- Fitness Statistics ---");
        System.out.println("Goal Achieved Days: " + goalCount);
        System.out.println("Maximum Steps in Week: " + maxSteps);
    }
}