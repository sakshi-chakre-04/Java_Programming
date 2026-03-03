/*
 * Assignment 1:
 * A hotel charges ₹3000 per day. For long stays, hotel provides discount to retain customers.
 * Rules:
 * - ₹3000/day
 * - If stay > 7 days -> 5% discount on total bill
 * Input: Number of days stayed
 * Validations: Days must be >= 0
 */

import java.util.Scanner;

public class program78_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of days stayed:");
        int days = sobj.nextInt();

        if (days < 0) {
            System.out.println("Invalid input. Days must be >= 0.");
            return;
        }

        double totalBill = days * 3000;

        if (days > 7) {
            totalBill = totalBill - (totalBill * 0.05);
        }

        System.out.println("Total Stay Duration: " + days + " days");
        System.out.println("Final Bill Amount: ₹" + totalBill);
    }
}