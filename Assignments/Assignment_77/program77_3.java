/*
 * Problem 3: User enters usage: calls(min), data(GB), SMS(count). 
 * App suggests the cheapest plan among 4 plans.
 * Input: mins, gb, sms
 * Output: recommendedPlan, totalCost
 * Twist: if usage exceeds plan limits, add per-unit extra
 */

import java.util.Scanner;

public class program77_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mins used: ");
        int mins = sc.nextInt();
        System.out.print("Enter GB used: ");
        int gb = sc.nextInt();
        System.out.print("Enter SMS count: ");
        int sms = sc.nextInt();

        // Plan 1: Basic (₹199), Plan 2: Value (₹399), Plan 3: Pro (₹599), Plan 4: Unlimited (₹999)
        double[] costs = {199, 399, 599, 999};
        String[] planNames = {"Basic", "Value", "Pro", "Unlimited"};
        
        // Simplified Logic for selection based on GB
        int recommendationIndex = (gb > 50) ? 3 : (gb > 20 ? 2 : (gb > 5 ? 1 : 0));

        System.out.println("Recommended Plan: " + planNames[recommendationIndex]);
        System.out.println("Total Cost: ₹" + costs[recommendationIndex]);
        
        sc.close();
    }
}