/*
 * Problem 2: Base fare depends on distance slabs. Add charges for class (Sleeper/3AC/2AC). 
 * If booking within 24 hours, add Tatkal 30%. Senior citizen gets 40% discount.
 * Input: distance, classType, bookingHoursBefore, age
 * Output: finalFare + reason breakdown
 */

import java.util.Scanner;

public class program77_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter Class (Sleeper/3AC/2AC): ");
        String classType = sc.next();
        System.out.print("Hours before travel: ");
        int hours = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        double baseFare = distance * 1.5; // Base slab logic
        double classCharge = classType.equalsIgnoreCase("2AC") ? 500 : (classType.equalsIgnoreCase("3AC") ? 300 : 100);
        double total = baseFare + classCharge;
        
        String breakdown = "Base + Class: " + total;

        if (hours < 24) {
            total += (total * 0.30);
            breakdown += "\n+ Tatkal (30%)";
        }
        if (age >= 60) {
            total -= (total * 0.40);
            breakdown += "\n- Senior Citizen Discount (40%)";
        }

        System.out.println("\n--- Fare Details ---");
        System.out.println(breakdown);
        System.out.println("Final Fare: ₹" + total);
        
        sc.close();
    }
}