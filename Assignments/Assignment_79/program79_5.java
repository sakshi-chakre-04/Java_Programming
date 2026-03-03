/*
Assignment 5: Design a Java application to manage monthly sales for different employees.
- Rows: Employees
- Columns: Months (e.g., Quarter 1: 3 months)

Requirements:
1. Calculate total sales per employee.
2. Find the monthly sales leader (Employee with most sales in a single month).
3. Calculate total revenue for the entire quarter.
4. Display employees who met a sales target (e.g., Total > 5000).

Input Format:
- E (Employees), M (Months)
- Next E lines: M integers (sales figures)
*/

import java.util.*;

public class program79_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int e = sc.nextInt();
        int m = sc.nextInt();

        if (e <= 0 || m <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int target = 5000;
        int totalQuarterRevenue = 0;
        int maxSingleMonthSale = -1;
        int leaderId = 0;

        System.out.println("Performance Report:");
        for (int i = 0; i < e; i++) {
            int empTotal = 0;
            for (int j = 0; j < m; j++) {
                int sale = sc.nextInt();
                empTotal += sale;
                if (sale > maxSingleMonthSale) {
                    maxSingleMonthSale = sale;
                    leaderId = i + 1;
                }
            }
            totalQuarterRevenue += empTotal;
            System.out.println("Employee " + (i + 1) + " Total: " + empTotal + 
                               (empTotal >= target ? " [TARGET MET]" : ""));
        }

        System.out.println("\nTotal Quarter Revenue: " + totalQuarterRevenue);
        System.out.println("Monthly Sales Leader: Employee " + leaderId);

        sc.close();
    }
}