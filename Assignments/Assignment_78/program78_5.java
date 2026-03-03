/*
 * Assignment 5:
 * A telecom company bills calls based on duration slabs. 
 * Rules:
 * - First 5 minutes free
 * - Next 10 minutes (6-15) -> ₹1 per minute
 * - Beyond 15 -> ₹2 per minute
 * Input: Call duration in minutes (integer)
 * Validations: Minutes must be >= 0
 */

import java.util.Scanner;

public class program78_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter call duration in minutes:");
        int duration = sobj.nextInt();

        if (duration < 0) {
            System.out.println("Invalid input. Minutes must be >= 0.");
            return;
        }

        int charge = 0;

        if (duration <= 5) {
            charge = 0;
        } else if (duration <= 15) {
            charge = (duration - 5) * 1;
        } else {
            // First 5 free + Next 10 at ₹1 (10) + remaining at ₹2
            charge = 10 + (duration - 15) * 2;
        }

        System.out.println("Call Duration: " + duration + " minutes");
        System.out.println("Total Call Charge: ₹" + charge);
    }
}