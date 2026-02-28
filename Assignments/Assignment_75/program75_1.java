/*
 * Question 1: A shopping mall parking gate records entry and exit duration in hours.
 * The parking system calculates charges based on the total hours a vehicle stayed.
 * Long-duration parking attracts additional penalty.
 * * Rules:
 * - First 2 hours -> ₹20 (flat)
 * - After 2 hours -> ₹10 per extra hour
 * - If total hours > 10 -> add ₹50 penalty
 */

import java.util.Scanner;

public class program75_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter total parking hours (integer): ");
        int hours = scanner.nextInt();

        // Validation: Hours cannot be negative
        if (hours < 0) {
            System.out.println("Error: Hours cannot be negative");
            return;
        }

        int amount = 0;
        if (hours <= 2) {
            amount = 20;
        } else {
            amount = 20 + (hours - 2) * 10;
        }

        // Add penalty if duration exceeds 10 hours
        if (hours > 10) {
            amount += 50;
        }

        System.out.println("Total Parking Duration: " + hours + " hours");
        System.out.println("Total Parking Fee: ₹" + amount);
        
        scanner.close();
    }
}