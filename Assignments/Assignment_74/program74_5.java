/*
5. E-commerce platform final payable amount:
Discount Rules:
- Amount > 5000 -> 20% discount
- Amount > 2000 -> 10% discount
- Premium members -> extra 5% discount on the discounted amount
Validations: Amount must be > 0, Membership must be valid
*/

import java.util.Scanner;

public class program74_5 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter purchase amount: ");
        int amount = sobj.nextInt();
        System.out.print("Enter membership type (Premium/Regular): ");
        String memberType = sobj.next();

        if (amount <= 0) {
            System.out.println("Amount must be > 0");
            return;
        }

        double discount = 0;
        if (amount > 5000) {
            discount = amount * 0.20;
        } else if (amount > 2000) {
            discount = amount * 0.10;
        }

        double discountedAmount = amount - discount;
        double finalPayable = discountedAmount;

        if (memberType.equalsIgnoreCase("Premium")) {
            double extraDiscount = discountedAmount * 0.05;
            discount += extraDiscount;
            finalPayable = discountedAmount - extraDiscount;
        }

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Total Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalPayable);
        
        sobj.close();
    }
}