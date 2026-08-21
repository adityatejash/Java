// Q2. Develop a Java program to perform matrix operations using arrays.

public class q2 {
    
    // Display matrix
    static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Matrix Addition
    static int[][] add(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Matrix Subtraction
    static int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Matrix Multiplication
    static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Matrix Transpose
    static int[][] transpose(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        System.out.println("Matrix A:");
        display(A);

        System.out.println("\nMatrix B:");
        display(B);

        System.out.println("\nA + B:");
        display(add(A, B));

        System.out.println("\nA - B:");
        display(subtract(A, B));

        System.out.println("\nA × B:");
        display(multiply(A, B));

        System.out.println("\nTranspose of A:");
        display(transpose(A));
    }
}