/*
 * 1. A ride-hailing app calculates trip fare based on distance and whether the trip happened during peak hours.
 * Peak hours increase demand, so surcharge applies.
 * Rules:
 * - Base fare ₹50
 * - First 10 km -> ₹12 per km
 * - Beyond 10 km -> ₹15 per km
 * - Peak hours -> 20% extra on total fare
 * Input: Distance in km (integer), Peak hour (Yes/No)
 * Validations: Distance cannot be negative
 */

import java.util.Scanner;

public class program76_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        int distance = sc.nextInt();
        System.out.print("Is it peak hour? (Yes/No): ");
        String isPeak = sc.next();

        if (distance < 0) {
            System.out.println("Validation Error: Distance cannot be negative.");
            return;
        }

        double totalFare = 50; // Base fare

        if (distance <= 10) {
            totalFare += (distance * 12);
        } else {
            totalFare += (10 * 12) + ((distance - 10) * 15);
        }

        if (isPeak.equalsIgnoreCase("Yes")) {
            totalFare = totalFare + (totalFare * 0.20);
        }

        System.out.println("Distance: " + distance + " km");
        System.out.println("Peak Hour: " + isPeak);
        System.out.println("Total Fare: ₹" + totalFare);
        
        sc.close();
    }
}