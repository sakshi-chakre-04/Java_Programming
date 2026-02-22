/*
4. Write a program which accept matrix and display addition of elements from each column.
Input: 
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5
Output: 18 18 15 25
*/

import java.util.Scanner;

public class program72_4 {
    public static void AddColumn(int Arr[][], int iRow, int iCol) {
        // Iterate through columns first
        for (int j = 0; j < iCol; j++) {
            int iSum = 0;
            for (int i = 0; i < iRow; i++) {
                iSum = iSum + Arr[i][j];
            }
            System.out.print(iSum + " ");
        }
        System.out.println();
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

        System.out.println("Column additions are:");
        AddColumn(Arr, row, col);
    }
}