import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrix:");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        if (isSymmetric(matrix)) {
            System.out.println("The given matrix is symmetric.");
        } else {
            System.out.println("The given matrix is not symmetric.");
        }
    }

    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
