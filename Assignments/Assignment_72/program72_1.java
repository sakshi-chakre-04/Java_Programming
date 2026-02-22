/*
1. Write a program which accept matrix from user and return addition of diagonal elements.
Input: 
3 2 5 9
4 3 2 2
8 4 1 5
3 9 7 5
Output: 12 (3 + 3 + 1 + 5)
*/

import java.util.Scanner;

public class program72_1 {
    public static int AddDiagonal(int Arr[][], int iRow, int iCol) {
        int iSum = 0;
        // Logic: Diagonal elements exist where row index == column index
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                if (i == j) {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int row = sobj.nextInt();
        int col = sobj.nextInt();

        int Arr[][] = new int[row][col];
        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }

        int iRet = AddDiagonal(Arr, row, col);
        System.out.println("Addition of diagonal elements is: " + iRet);
    }
}