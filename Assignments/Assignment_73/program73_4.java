/*
 * 4. Write a program which accept matrix and check whether the matrix is Identity matrix or not.
 * Identity matrix is a square matrix with 1's along the diagonal and 0's in all other positions.
 */

public class program73_4 {
    public static boolean ChkIdentity(int Arr[][], int iRow, int iCol) {
        // Identity matrix must be square
        if (iRow != iCol) return false;

        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                // Diagonal elements should be 1
                if (i == j && Arr[i][j] != 1) {
                    return false;
                }
                // Non-diagonal elements should be 0
                if (i != j && Arr[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
        };
        boolean bRet = ChkIdentity(matrix, 4, 4);
        System.out.println("Is Identity: " + bRet);
    }
}