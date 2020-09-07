import java.util.Arrays;
import java.util.Scanner;
/* Write a program that reads two integer matrices (2D arrays) from the console and compares them element by element. For better code reusability, you could do the comparison in a method, which returns true if they are equal and false if not.
Each matrix definition on the console will contain a line with a positive integer number R – the number of rows in the matrix and C – the number of columns – followed by R lines containing the C numbers, separated by spaces (each line will have an equal amount of numbers.
The matrices will have at most 10 rows and at most 10 columns.
Print equal if the matrices match, and not equal if they don’t match.
Examples
Input	Output
2 3
1 2 3
2 1 3
2 3
1 2 3
2 1 3	equal
2 3
1 2 3
4 5 6
2 2
1 3
4 5	not equal

*\
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //reading input
        int[] firstDimensions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        int firstMatrixRows = firstDimensions[0];
        int firstMatrixCols = firstDimensions[1];

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        readMatrix(scanner, firstMatrix);

        int[] secondDimensions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        int secondMatrixRows = secondDimensions[0];
        int secondMatrixCols = secondDimensions[1];

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        readMatrix(scanner, secondMatrix);
        if (compareMatrix(firstMatrix,secondMatrix)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }


    private static void readMatrix(Scanner scanner, int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s++"))
                    .mapToInt(x -> Integer.parseInt(x))
                    .toArray();
            matrix[i] = line;
        }
    }

    private static boolean compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int [] firstArr = firstMatrix[row];
            int [] secondArr = secondMatrix[row];
            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int col = 0; col < firstArr.length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col])
                    return false;
            }

        }
        return true;

    }
}
