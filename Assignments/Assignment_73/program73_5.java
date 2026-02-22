/*
 * 5. Write a program which accept matrix and check whether the matrix is Sparse matrix or not.
 * Sparse matrix is a matrix with the majority of its elements equal to zero.
 */

public class program73_5 {
    public static boolean ChkSparse(int Arr[][], int iRow, int iCol) {
        int iCount = 0;
        int totalElements = iRow * iCol;

        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                if (Arr[i][j] == 0) {
                    iCount++;
                }
            }
        }

        // Majority means more than half are zeros
        return iCount > (totalElements / 2);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 3, 0},
            {0, 6, 0, 0},
            {0, 0, 1, 0},
            {9, 0, 0, 9}
        };
        boolean bRet = ChkSparse(matrix, 4, 4);
        System.out.println("Is Sparse: " + bRet);
    }
}