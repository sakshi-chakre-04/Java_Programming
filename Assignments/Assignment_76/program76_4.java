/*
 * 4. A customer enters a store with a fixed budget. They pick items one by one in a given order.
 * The cashier wants to know how many items can be purchased before money becomes insufficient.
 * Input: Budget amount, Number of items N, N item prices
 * Validations: Budget >= 0, N >= 0, Each price > 0
 */

import java.util.Scanner;

public class program76_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter budget amount: ");
        double budget = sc.nextDouble();
        System.out.print("Enter number of items N: ");
        int n = sc.nextInt();

        if (budget < 0 || n < 0) {
            System.out.println("Validation Error: Budget and N must be non-negative.");
            return;
        }

        int count = 0;
        double remainingBalance = budget;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = sc.nextDouble();

            if (price <= 0) {
                System.out.println("Validation Error: Price must be > 0");
                return;
            }

            if (remainingBalance >= price) {
                remainingBalance -= price;
                count++;
            } else {
                System.out.println("Insufficient funds for next item.");
                break;
            }
        }

        System.out.println("Items Purchased: " + count);
        System.out.println("Remaining Balance: ₹" + remainingBalance);
        
        sc.close();
    }
}