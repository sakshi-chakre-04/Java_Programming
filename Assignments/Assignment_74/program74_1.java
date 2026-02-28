/*
1. In your college library, students borrow books for exams and assignments.
The librarian wants an automatic fine calculator.
As per policy, a student can keep a borrowed book for up to 7 days without any penalty.
Fine Rules:
- 0 to 7 days -> No fine
- 8 to 12 days -> ₹5 per day for each day beyond 7
- More than 12 days -> ₹5 per day for days 8-12 AND ₹10 per day for each day beyond 12
Validations: If daysKept < 0 -> invalid input
*/

import java.util.Scanner;

public class program74_1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter total number of days the book was kept: ");
        int daysKept = sobj.nextInt();

        if (daysKept < 0) {
            System.out.println("invalid input");
        } else if (daysKept <= 7) {
            System.out.println("Returned on time. No fine applicable.");
        } else {
            int fineAmount = 0;
            if (daysKept <= 12) {
                fineAmount = (daysKept - 7) * 5;
            } else {
                // First 5 late days (8-12) at ₹5 = ₹25
                // Remaining days at ₹10
                fineAmount = 25 + (daysKept - 12) * 10;
            }
            System.out.println("Total fine to be paid: ₹" + fineAmount);
        }
        sobj.close();
    }
}