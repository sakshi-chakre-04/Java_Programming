/*
 * 3. A courier counter calculates delivery charge by weight. Charges increase when parcel is heavier.
 * Charges:
 * - Up to 1 kg -> ₹50
 * - 1-5 kg -> ₹50 + ₹20/kg above 1 kg
 * - Above 5 kg -> ₹150 + ₹30/kg above 5 kg
 * Input: Parcel weight in kg (integer)
 * Validations: Weight must be > 0
 */

import java.util.Scanner;

public class program76_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parcel weight (kg): ");
        int weight = sc.nextInt();

        if (weight <= 0) {
            System.out.println("Validation Error: Weight must be > 0");
            return;
        }

        int charge = 0;
        if (weight <= 1) {
            charge = 50;
        } else if (weight <= 5) {
            charge = 50 + ((weight - 1) * 20);
        } else {
            charge = 150 + ((weight - 5) * 30);
        }

        System.out.println("Parcel Weight: " + weight + " kg");
        System.out.println("Courier Charge: ₹" + charge);
        
        sc.close();
    }
}