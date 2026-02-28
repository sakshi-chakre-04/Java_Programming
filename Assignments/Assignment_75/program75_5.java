/*
 * Question 5: A tax portal calculates income tax based on annual income using progressive slabs.
 * Only the amount in a slab is taxed at that slab's rate.
 * Slabs:
 * - Up to ₹2,50,000 -> 0%
 * - ₹2,50,001 to ₹5,00,000 -> 5%
 * - ₹5,00,001 to ₹10,00,000 -> 20%
 * - Above ₹10,00,000 -> 30%
 */

import java.util.Scanner;

public class program75_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual income (integer): ");
        long income = sc.nextLong();

        // Validation
        if (income < 0) {
            System.out.println("Error: Income cannot be negative");
            return;
        }

        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.20;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
        }

        System.out.println("Annual Income: ₹" + income);
        System.out.println("Total Tax Payable: ₹" + tax);
        sc.close();
    }
}