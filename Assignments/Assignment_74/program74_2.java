/*
2. A bank ATM must follow strict safety rules:
- Withdrawal amount must be a multiple of ₹100
- Maximum withdrawal per transaction is ₹25,000
- After withdrawal, balance must remain at least ₹1,000
Validations: If balance < 0 or withdrawAmount <= 0 -> invalid input
*/

import java.util.Scanner;

public class program74_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter current balance: ");
        int balance = sobj.nextInt();
        System.out.print("Enter requested withdrawal amount: ");
        int withdrawAmount = sobj.nextInt();

        if (balance < 0 || withdrawAmount <= 0) {
            System.out.println("invalid input");
        } else if (withdrawAmount % 100 != 0) {
            System.out.println("Transaction Failed: Amount must be a multiple of ₹100");
        } else if (withdrawAmount > 25000) {
            System.out.println("Transaction Failed: Maximum withdrawal is ₹25,000");
        } else if ((balance - withdrawAmount) < 1000) {
            System.out.println("Transaction Failed: Minimum balance of ₹1,000 required");
        } else {
            int newBalance = balance - withdrawAmount;
            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance: ₹" + newBalance);
        }
        sobj.close();
    }
}