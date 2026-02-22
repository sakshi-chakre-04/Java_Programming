/*
3. Write a program which accept matrix and return largest number from both the diagonals.
Input: 
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5
Output: 9
*/

import java.util.Scanner;

public class program72_3 {
    public static int MaxDiagonal(int Arr[][], int iRow, int iCol) {
        int iMax = Arr[0][0]; 
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                // Check Main Diagonal (i == j) and Anti-Diagonal (i + j == iCol - 1)
                if ((i == j) || (i + j == iCol - 1)) {
                    if (Arr[i][j] > iMax) {
                        iMax = Arr[i][j];
                    }
                }
            }
        }
        return iMax;
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

        int iRet = MaxDiagonal(Arr, row, col);
        System.out.println("Largest diagonal element is: " + iRet);
    }
}