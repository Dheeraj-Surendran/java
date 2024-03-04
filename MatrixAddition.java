import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for the first matrix:");
        int columns1 = scanner.nextInt();

        double[][] matrix1 = new double[rows1][columns1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter the number of rows for the second matrix:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for the second matrix:");
        int columns2 = scanner.nextInt();

        if (rows1 != rows2 || columns1 != columns2) {
            System.out.println("Matrices cannot be added, as they have different dimensions.");
            return;
        }

        double[][] matrix2 = new double[rows2][columns2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        double[][] result = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The resultant matrix after addition is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
