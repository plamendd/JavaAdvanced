/*
Write a program that reads two char matrices (A[][] and B[][])
of the same order M * N and prints third matrix C[][] which is filled with the intersecting
 elements of A and B, otherwise set the element to '*'.
  On the first two lines you receive M and N, then on 2 * M lines N characters
  – the matrices elements.
The matrix elements may be any ASCII char except '*'.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixRows = Integer.parseInt(scanner.nextLine());
        int matrixCols = Integer.parseInt(scanner.nextLine());

        char [][] firstMatrix = new char[matrixRows][matrixCols];
        char [][] secondMatrix = new char[matrixRows][matrixCols];

        readMatrix(scanner, firstMatrix);
        readMatrix(scanner, secondMatrix);

        for (int row = 0; row < firstMatrix.length ; row++) {
            for (int col = 0; col < firstMatrix[row].length ; col++) {
                char c1 = firstMatrix[row][col];
                char c2 = secondMatrix[row][col];
                if (c1 == c2 ) {
                    System.out.print(c1 + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
    private static void readMatrix(Scanner scanner, char matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            char [] line = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

            matrix[i] = line;
        }
    }
}
