import java.util.Arrays;
import java.util.Scanner;

/*
Write a program that reads a matrix of integers from the console, then a number and prints all the positions at
which that number appears in the matrix.
The matrix definition on the console will contain a line with two positive integer numbers R and C – the number of
rows and columns in the matrix – followed by R lines, each containing C numbers (separated by spaces),
representing each row of the matrix.
The number you will need to find the positions of will be entered on a single line, after the matrix.
You should print each position on a single line – first print the row, then the column at which the number appears.
If the number does not appear in the matrix, print not found
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstDimensions = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();

        int firstMatrixRows = firstDimensions[0];
        int firstMatrixCols = firstDimensions[1];

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        readMatrix(scanner, firstMatrix);
        int number = Integer.parseInt(scanner.nextLine());
        StringBuilder builder = new StringBuilder();

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
               if (firstMatrix[row][col] == number){
                   builder.append(row + " " + col + System.lineSeparator());
               }
            }
        }

        if (builder.length() == 0){
            System.out.println("not found");
        } else {
            System.out.println(builder);
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
}
