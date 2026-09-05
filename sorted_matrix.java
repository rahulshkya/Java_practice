
public class sorted_matrix {

    public static boolean sorted(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix[0].length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.print("key was not found in matrix");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};

        int key = 33;

        sorted(matrix, key);

    }

}
