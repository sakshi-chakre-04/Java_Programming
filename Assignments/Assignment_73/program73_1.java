/*
 * 1. Write a program which accept matrix from user and display transpose of the matrix.
 * The transpose of a given matrix is formed by interchanging the rows and columns of a matrix.
 */

public class program73_1 {
    public static void Transpose(int Arr[][], int iRow, int iCol) {
        // We create a new matrix to store the result, or print directly
        int result[][] = new int[iCol][iRow];

        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                result[j][i] = Arr[i][j];
            }
        }

        // Displaying the transposed matrix
        for (int i = 0; i < iCol; i++) {
            for (int j = 0; j < iRow; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 5, 9},
            {4, 3, 2, 2},
            {8, 4, 1, 5},
            {3, 9, 7, 5}
        };
        Transpose(matrix, 4, 4);
    }
}