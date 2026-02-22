/*
5. Write a program which accept matrix and swap the contents of consecutive rows.
Input: 
3 2 5 9 (Row 0)
4 3 2 2 (Row 1)
8 4 1 9 (Row 2)
3 9 7 5 (Row 3)

Output:
4 3 2 2 (Row 1 becomes 0)
3 2 5 9 (Row 0 becomes 1)
3 9 7 5 (Row 3 becomes 2)
8 4 1 9 (Row 2 becomes 3)
*/

import java.util.Scanner;

public class program72_5 {
    public static void SwapRows(int Arr[][], int iRow, int iCol) {
        // Step through rows by 2 to swap pairs (0&1, 2&3, etc.)
        for (int i = 0; i < iRow - 1; i += 2) {
            for (int j = 0; j < iCol; j++) {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp;
            }
        }

        // Displaying the result
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int row = sobj.nextInt();
        int col = sobj.nextInt();

        int Arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Matrix after swapping consecutive rows:");
        SwapRows(Arr, row, col);
    }
}