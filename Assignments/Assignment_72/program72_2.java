/*
2. Write a program which accept matrix and one number from user and return frequency of that number.
Input: 9
3 2 5 9
4 3 2 2
8 4 1 9
3 9 7 5
Output: 3 (9 appears three times)
*/

import java.util.Scanner;

public class program72_2 {
    public static int CountFrequency(int Arr[][], int iRow, int iCol, int iNo) {
        int iCount = 0;
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                if (Arr[i][j] == iNo) {
                    iCount++;
                }
            }
        }
        return iCount;
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter rows, columns and number to search:");
        int row = sobj.nextInt();
        int col = sobj.nextInt();
        int num = sobj.nextInt();

        int Arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arr[i][j] = sobj.nextInt();
            }
        }

        int iRet = CountFrequency(Arr, row, col, num);
        System.out.println("Frequency is: " + iRet);
    }
}