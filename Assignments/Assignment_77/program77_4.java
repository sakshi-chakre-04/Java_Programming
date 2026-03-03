/*
 * Problem 4: Water Bill with Progressive Slabs + Late Fee. 
 * Slabs + fixed meter charge. If paid after due date, add 2% penalty per week late (max 10%).
 * Input: units, weeksLate
 * Output: billAmount
 */

import java.util.Scanner;

public class program77_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        System.out.print("Enter weeks late: ");
        int weeks = sc.nextInt();

        double fixedCharge = 150;
        double unitRate = (units <= 100) ? 5 : (units <= 200 ? 8 : 12);
        double baseBill = fixedCharge + (units * unitRate);

        double penaltyRate = Math.min(0.10, weeks * 0.02);
        double finalBill = baseBill + (baseBill * penaltyRate);

        System.out.println("Base Bill: ₹" + baseBill);
        System.out.println("Final Bill (incl. penalty): ₹" + finalBill);
        
        sc.close();
    }
}