/*
4. Electricity company progressive billing:
Slabs:
- First 100 units -> ₹5 per unit
- Next 100 units (101-200) -> ₹7 per unit
- Above 200 units -> ₹10 per unit
Validations: Units cannot be negative
*/

import java.util.Scanner;

public class program74_4 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sobj.nextInt();

        if (units < 0) {
            System.out.println("Units cannot be negative");
        } else {
            double amount = 0;
            if (units <= 100) {
                amount = units * 5;
            } else if (units <= 200) {
                amount = (100 * 5) + (units - 100) * 7;
            } else {
                amount = (100 * 5) + (100 * 7) + (units - 200) * 10;
            }

            System.out.println("Total Units Consumed: " + units);
            System.out.println("Total Electricity Bill: ₹" + amount);
        }
        sobj.close();
    }
}