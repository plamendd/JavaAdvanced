import java.util.Arrays;
import java.util.Scanner;

/*
Write a program that reads a matrix from the console. Then print the diagonals.
The matrix will always be square. On the first line you read a single integer N the matrix size.
Then on each line N elements. The first diagonal should always start with the element at the first
row and col, the second diagonal should start with the element at the last row and first col.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRowAndCols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[numberOfRowAndCols][numberOfRowAndCols];
        readMatrix(scanner, matrix);


        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row++][col++] + " ");
        }
        System.out.println();

        row = matrix.length - 1;
        col = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row--][col++]+ " ");
        }


    }

    private static void readMatrix(Scanner scanner, int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(x -> Integer.parseInt(x))
                    .toArray();
            matrix[i] = line;
        }
    }
}
