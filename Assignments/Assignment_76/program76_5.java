/*
 * 5. A phone OS shows different battery warnings. The user wants a program that prints the correct battery status.
 * Rules:
 * - Battery <= 5% -> Critical
 * - Battery <= 15% -> Low
 * - Otherwise -> Normal
 * Input: Battery percentage (integer)
 * Validations: 0 to 100 only
 */

import java.util.Scanner;

public class program76_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int percentage = sc.nextInt();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Validation Error: 0 to 100 only");
            return;
        }

        String status;
        if (percentage <= 5) {
            status = "Critical";
        } else if (percentage <= 15) {
            status = "Low";
        } else {
            status = "Normal";
        }

        System.out.println("Battery Percentage: " + percentage + "%");
        System.out.println("Status: " + status);
        
        sc.close();
    }
}