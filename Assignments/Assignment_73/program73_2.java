/*
 * 2. Write a program which accept matrix and reverse the contents of each row.
 */

public class program73_2 {
    public static void ReverseRow(int Arr[][], int iRow, int iCol) {
        for (int i = 0; i < iRow; i++) {
            int start = 0;
            int end = iCol - 1;
            
            // Swap elements from both ends of the row
            while (start < end) {
                int temp = Arr[i][start];
                Arr[i][start] = Arr[i][end];
                Arr[i][end] = temp;
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
        ReverseRow(matrix, 4, 4);
    }
}