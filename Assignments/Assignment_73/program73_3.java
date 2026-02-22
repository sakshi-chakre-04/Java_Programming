/*
 * 3. Write a program which accept matrix and reverse the contents of each column.
 */

public class program73_3 {
    public static void ReverseCol(int Arr[][], int iRow, int iCol) {
        for (int j = 0; j < iCol; j++) {
            int start = 0;
            int end = iRow - 1;

            // Swap elements from top and bottom of the column
            while (start < end) {
                int temp = Arr[start][j];
                Arr[start][j] = Arr[end][j];
                Arr[end][j] = temp;
                start++;
                end--;
            }
        }

        // Display the modified matrix
        for (int i = 0; i < iRow; i++) {
            for (int j = 0; j < iCol; j++) {
                System.out.print(Arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 5, 9},
            {4, 3, 2, 2},
            {8, 4, 1, 9},
            {3, 9, 7, 5}
        };
        ReverseCol(matrix, 4, 4);
    }
}