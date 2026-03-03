/*
 * Assignment 3:
 * A fitness app records steps for 7 days. It wants to show how many days user 
 * achieved the goal and what the highest step count was.
 * Input: 7 integers (steps)
 * Validations: Steps must be >= 0
 * Note: Assuming a standard goal of 10,000 steps for the "Goal Achieved" count.
 */

import java.util.Scanner;

public class program78_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int[] steps = new int[7];
        int goal = 10000; // Standard daily goal
        int goalAchievedDays = 0;
        int maxSteps = 0;

        System.out.println("Enter steps for 7 days:");
        for (int i = 0; i < 7; i++) {
            steps[i] = sobj.nextInt();
            
            if (steps[i] < 0) {
                System.out.println("Invalid input. Steps cannot be negative.");
                return;
            }

            if (steps[i] >= goal) {
                goalAchievedDays++;
            }

            if (steps[i] > maxSteps) {
                maxSteps = steps[i];
            }
        }

        System.out.println("Goal Achieved Days: " + goalAchievedDays);
        System.out.println("Maximum Steps in Week: " + maxSteps);
    }
}