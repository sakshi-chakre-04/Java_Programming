/*
 * 2. A scholarship committee uses a strict checklist. Only students who meet all academic and financial conditions qualify.
 * Conditions:
 * - Marks >= 80%
 * - Attendance >= 75%
 * - Family income <= ₹3,00,000
 * Input: Marks percent (integer), Attendance percent (integer), Family income (integer)
 * Validations: Marks and attendance must be 0-100, Income cannot be negative
 */

import java.util.Scanner;

public class program76_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks percent: ");
        int marks = sc.nextInt();
        System.out.print("Enter attendance percent: ");
        int attendance = sc.nextInt();
        System.out.print("Enter family income: ");
        int income = sc.nextInt();

        if (marks < 0 || marks > 100 || attendance < 0 || attendance > 100) {
            System.out.println("Validation Error: Marks and attendance must be 0-100.");
            return;
        }
        if (income < 0) {
            System.out.println("Validation Error: Income cannot be negative.");
            return;
        }

        if (marks >= 80 && attendance >= 75 && income <= 300000) {
            System.out.println("Scholarship Approved");
        } else {
            String reason = "";
            if (marks < 80) reason += "Low Marks; ";
            if (attendance < 75) reason += "Low Attendance; ";
            if (income > 300000) reason += "High Income; ";
            System.out.println("Scholarship Rejected: " + reason);
        }
        
        sc.close();
    }
}