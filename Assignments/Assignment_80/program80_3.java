/*
Question 3: Design a Java application to simulate a warehouse robot moving inside a grid.
The warehouse is represented as a matrix:
- 0 -> Free space
- -1 -> Obstacle
Robot starts at (0,0) and must reach (R-1, C-1).
Robot can only move: Right, Down.
Requirements:
1. Determine if a valid path exists.
2. If exists, print "Path Available".
3. Otherwise print "No Path Found".
*/

import java.util.Scanner;

public class program80_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Grid Dimensions
        int r = sc.nextInt();
        int c = sc.nextInt();

        if (r <= 0 || c <= 0) {
            System.out.println("Invalid dimensions.");
            return;
        }

        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Check if start or end is blocked
        if (grid[0][0] == -1 || grid[r - 1][c - 1] == -1) {
            System.out.println("No Path Found");
            return;
        }

        // Use Dynamic Programming to check reachability
        boolean[][] dp = new boolean[r][c];
        dp[0][0] = true;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // If current cell is an obstacle, it cannot be part of a path
                if (grid[i][j] == -1) {
                    dp[i][j] = false;
                    continue;
                }
                
                // Can reach from above
                if (i > 0 && dp[i - 1][j]) {
                    dp[i][j] = true;
                }
                // Can reach from left
                if (j > 0 && dp[i][j - 1]) {
                    dp[i][j] = true;
                }
            }
        }

        if (dp[r - 1][c - 1]) {
            System.out.println("Path Available");
        } else {
            System.out.println("No Path Found");
        }
    }
}