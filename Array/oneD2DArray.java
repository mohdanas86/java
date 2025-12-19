
public class oneD2DArray {

    public static void print1DArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println("\n");
    }

    // 2D Array
    public static void print2DArray() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        // 1D Array print
        System.out.println("1D Array");
        print1DArray();

        // 2D Array print
        System.out.println("2D Array");
        print2DArray();
    }
}
