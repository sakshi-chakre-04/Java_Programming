/*
 * Problem 1: A hospital bill includes consultation + medicine + room charges per day. 
 * If insured, insurance covers up to ₹50,000 or 70% of bill (whichever is lower). 
 * ICU ward costs extra.
 * Input: days, wardType(Normal/ICU), medicineBill, consultationFee, insured(Yes/No)
 * Output: totalBill, insuranceCover, finalPay
 */

import java.util.Scanner;

public class program77_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        System.out.print("Enter ward type (Normal/ICU): ");
        String wardType = sc.next();
        System.out.print("Enter medicine bill: ");
        int medicineBill = sc.nextInt();
        System.out.print("Enter consultation fee: ");
        int consultationFee = sc.nextInt();
        System.out.print("Is the patient insured? (Yes/No): ");
        String insured = sc.next();
        if (days < 0 || medicineBill < 0 || consultationFee < 0) {
            System.out.println("Validation Error: Days, medicine bill, and consultation fee cannot be negative.");
            return;
        }
        
        int roomCharge = 0;
        if (wardType.equals("Normal")) {
            roomCharge = 1000 * days;
        } else if (wardType.equals("ICU")) {
            roomCharge = 2000 * days;
        } else {
            System.out.println("Invalid ward type.");
            return;
        }

        int totalBill = medicineBill + consultationFee + roomCharge;
        int insuranceCover = 0;

        if (insured.equals("Yes")) {
            insuranceCover = Math.min(50000, (int)(totalBill * 0.7));
        }

        int finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Insurance Cover: ₹" + insuranceCover);
        System.out.println("Final Payment: ₹" + finalPay);
        
    }
}