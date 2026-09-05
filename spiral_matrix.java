
public class spiral_matrix {

    public static void spiral(int arr[][]) {
        int start_row = 0;
        int end_row = arr.length;
        int start_col = 0;
        int end_col = arr[0].length;

        while (start_row < end_row && start_col < end_col) {

            //Top
            for (int i = start_col; i < end_col; i++) {
                System.out.print(arr[start_row][i]);
            }

            //Right
            for (int i = start_row + 1; i < end_row; i++) {
                System.out.print(arr[i][end_col - 1]);
            }

            //Bottom
            for (int i = end_col - 2; i >= start_row; i--) {
                System.out.print(arr[end_row - 1][i]);
            }

            //Left
            for (int i = end_row - 2; i > start_row; i--) {
                System.out.print(arr[i][start_col]);
            }

            start_col++;
            start_row++;
            end_col--;
            end_row--;
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
            //   0  1   2   3 
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiral(arr);

    }
}
