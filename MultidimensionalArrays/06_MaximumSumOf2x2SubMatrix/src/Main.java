/*
Write a program that reads a matrix from the console. Then find the biggest sum of a 2x2 submatrix.
Print the submatrix and its sum.
On the first line you will get the dimensions of the matrix in format {rows, columns}.
 On the next lines you will get the elements for each row separated with a coma.
---------------------
 3, 6
7, 1, 3, 3, 2, 1
1, 3, 9, 8, 5, 6
4, 6, 7, 9, 1, 0

9 8
7 9
33
----------------------
2, 4
10, 11, 12, 13
14, 15, 16, 17	12 13
16 17
58
---------------------------
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];

        int[][] matrix = new int[matrixRows][matrixCols];

        readMatrix(scanner, matrix);
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int indexRows = 0;
        int indexCols = 0;

        for (int row = 1; row < matrix.length; row++) {
            for (int col = 1; col < matrix[row].length; col++) {
                sum += matrix[row][col];
                sum += matrix[row][col - 1];
                sum += matrix[row - 1][col - 1];
                sum += matrix[row - 1][col];
                if (sum > maxSum) {
                    maxSum = sum;
                    indexRows = row;
                    indexCols = col;
                }
                sum = 0;
            }

        }

        for (int row = indexRows - 1; row < indexRows + 1; row++) {
            for (int col = indexCols - 1; col < indexCols + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }

    private static void readMatrix(Scanner scanner, int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(x -> Integer.parseInt(x))
                    .toArray();
            matrix[i] = line;
        }
    }
}
