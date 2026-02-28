/*
 * Question 2: A bank wants to quickly decide whether a customer is eligible for a personal loan.
 * Eligibility Conditions:
 * - Age 21 to 60 inclusive
 * - Monthly income >= ₹25,000
 * - Credit score > 700
 * - Must NOT have an existing unpaid loan
 */

import java.util.Scanner;

public class program75_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();
        System.out.print("Enter Credit Score: ");
        int score = sc.nextInt();
        System.out.print("Existing unpaid loan (Yes/No): ");
        String existingLoan = sc.next();

        // Validations
        if (age < 0 || income < 0 || score < 0) {
            System.out.println("Error: Age/income/score must be non-negative");
            return;
        }
        if (!existingLoan.equalsIgnoreCase("Yes") && !existingLoan.equalsIgnoreCase("No")) {
            System.out.println("Error: Yes/No must be valid");
            return;
        }

        // Logic check
        if (age < 21 || age > 60) {
            System.out.println("Loan Rejected: Age must be 21 to 60 inclusive");
        } else if (income < 25000) {
            System.out.println("Loan Rejected: Monthly income must be >= ₹25,000");
        } else if (score <= 700) {
            System.out.println("Loan Rejected: Credit score must be > 700");
        } else if (existingLoan.equalsIgnoreCase("Yes")) {
            System.out.println("Loan Rejected: Applicant has an existing unpaid loan");
        } else {
            System.out.println("Loan Approved");
        }
        
        sc.close();
    }
}