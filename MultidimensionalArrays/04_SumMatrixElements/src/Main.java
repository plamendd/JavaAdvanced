/*
Write a program that reads a matrix from the console and prints:
The count of rows
The count of columns
The sum of all matrix’s elements
On the first line you will get the dimensions of the matrix in format {rows, columns}.
On the next lines you will get the elements for each row separated with a coma.
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
        for (int[] arr : matrix) {
            for (int number : arr) {
                sum += number;
            }
        }
        System.out.println(matrixRows);
        System.out.println(matrixCols);
        System.out.println(sum);

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
