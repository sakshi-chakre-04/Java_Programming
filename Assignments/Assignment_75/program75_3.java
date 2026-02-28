/*
 * Question 3: A warehouse has a product in stock. Every time a customer places an order, 
 * the system must check if enough stock exists.
 * * Rules:
 * - If requested quantity > available stock -> order fails
 * - Else deduct quantity
 * - If remaining stock < 5 -> print low stock alert
 */

import java.util.Scanner;

public class program75_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current stock (integer): ");
        int stock = sc.nextInt();
        System.out.print("Enter Requested quantity (integer): ");
        int requested = sc.nextInt();

        // Validations
        if (stock < 0) {
            System.out.println("Error: Stock cannot be negative");
            return;
        }
        if (requested <= 0) {
            System.out.println("Error: Requested quantity must be > 0");
            return;
        }

        if (requested > stock) {
            System.out.println("Order Failed: Insufficient Stock.");
        } else {
            stock -= requested;
            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + stock);
            
            if (stock < 5) {
                System.out.println("Low Stock Alert!");
            }
        }
        sc.close();
    }
}