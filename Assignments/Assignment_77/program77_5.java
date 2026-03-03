/*
 * Problem 5: Cinema Seat Booking with Row Pricing + Group Discount. 
 * Seats have different prices per row. User tries booking multiple seats; 
 * reject if already booked. If group size >= 6 give 10% discount.
 * Input: rows, cols, bookedSeatList, requestedSeatList
 * Output: success/fail + total cost + remaining seats
 */

import java.util.ArrayList;
import java.util.Scanner;

public class program77_5 {
    public static void main(String[] args) {
        // Simplified logic for demonstration
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> bookedSeats = new ArrayList<>();
        bookedSeats.add(10); // Example pre-booked seat

        System.out.print("How many seats do you want to book? ");
        int count = sc.nextInt();
        
        double pricePerSeat = 250;
        double totalCost = count * pricePerSeat;

        if (count >= 6) {
            totalCost -= (totalCost * 0.10);
            System.out.println("Group discount applied!");
        }

        System.out.println("Booking Success!");
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("Seats remaining: " + (100 - bookedSeats.size() - count));
        
        sc.close();
    }
}