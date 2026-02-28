/*
 * Question 4: A traffic police app records whether a rider violated rules.
 * Each violation has a fixed fine. If multiple violations happen, fines should be added.
 * Fines: No helmet -> ₹500, No license -> ₹1000, Overspeeding -> ₹1500
 */

import java.util.Scanner;

public class program75_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Helmet worn (Yes/No): ");
        String helmet = sc.next();
        System.out.print("License available (Yes/No): ");
        String license = sc.next();
        System.out.print("Overspeeding (Yes/No): ");
        String speeding = sc.next();

        // Validation
        if (!isValid(helmet) || !isValid(license) || !isValid(speeding)) {
            System.out.println("Error: Inputs must be Yes/No only");
            return;
        }

        int totalFine = 0;
        if (helmet.equalsIgnoreCase("No")) totalFine += 500;
        if (license.equalsIgnoreCase("No")) totalFine += 1000;
        if (speeding.equalsIgnoreCase("Yes")) totalFine += 1500;

        System.out.println("Total Fine Amount: ₹" + totalFine);
        sc.close();
    }

    private static boolean isValid(String input) {
        return input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("No");
    }
}