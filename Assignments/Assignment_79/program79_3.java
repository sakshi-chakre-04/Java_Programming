/*
Assignment 3: Design a Java application to manage warehouse inventory using a 2D array.
- Rows represent different Warehouses.
- Columns represent specific Product Categories.

Requirements:
1. Calculate total stock in each warehouse.
2. Find the warehouse with the minimum stock.
3. Find the product category with the highest stock across all warehouses.
4. Check if any warehouse is out of stock (total stock = 0).

Input Format:
- W (Warehouses), P (Product Categories)
- Next W lines: P integers (stock counts)

Validations:
- W > 0, P > 0
- Stock values must be non-negative (>= 0)
*/

import java.util.*;

public class program79_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int w = sc.nextInt();
        if (!sc.hasNextInt()) return;
        int p = sc.nextInt();

        if (w <= 0 || p <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        int[][] inventory = new int[w][p];
        int[] warehouseTotals = new int[w];
        int[] categoryTotals = new int[p];

        for (int i = 0; i < w; i++) {
            int currentTotal = 0;
            for (int j = 0; j < p; j++) {
                int val = sc.nextInt();
                if (val < 0) {
                    System.out.println("Invalid Input");
                    return;
                }
                inventory[i][j] = val;
                currentTotal += val;
                categoryTotals[j] += val;
            }
            warehouseTotals[i] = currentTotal;
        }

        // 1 & 2. Warehouse Stats
        int minStock = warehouseTotals[0];
        int minWarehouse = 1;
        boolean outOfStockFound = false;

        System.out.println("Warehouse Totals:");
        for (int i = 0; i < w; i++) {
            System.out.println("Warehouse " + (i + 1) + ": " + warehouseTotals[i]);
            if (warehouseTotals[i] < minStock) {
                minStock = warehouseTotals[i];
                minWarehouse = i + 1;
            }
            if (warehouseTotals[i] == 0) outOfStockFound = true;
        }

        // 3. Category Stats
        int maxCategoryStock = categoryTotals[0];
        int topCategory = 1;
        for (int j = 1; j < p; j++) {
            if (categoryTotals[j] > maxCategoryStock) {
                maxCategoryStock = categoryTotals[j];
                topCategory = j + 1;
            }
        }

        System.out.println("\nMinimum Stock: Warehouse " + minWarehouse);
        System.out.println("Highest Stock Category: Category " + topCategory);
        System.out.println("Out of Stock Warehouse Exists: " + (outOfStockFound ? "Yes" : "No"));

        sc.close();
    }
}