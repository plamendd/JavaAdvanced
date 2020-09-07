/*
Write a program that reads (8 x 8) matrix of characters from the console.
The matrix represents a chess board with figures on it. The figures can be -
queens as char 'q' or any other ASCII symbol. There will be more than one queen but only one queen
will have valid position, which is not attacked from any other queen and does not attack any other
 queen. In other word in the way of the valid queen there are no other queens, but there may be any
  other ASCII symbol. Your task is to read the chessboard and find the position of the valid queen.
  According to chess rules the queen can attack all the cells in horizontal vertical and both
  diagonals which cross the queen position.
 */

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char [][] matrix = new char [8][8];
        readMatrix(scanner, matrix);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'q' && isValidQueen(row, col,matrix )){
                    System.out.println(row + " " + col);
                }
            }
        }


    }
    private static void readMatrix(Scanner scanner, char matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            char [] line = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

            matrix[i] = line;
        }
    }
    private static boolean isValidQueen(int row, int col, char [][] matrix){
        for (int rowDirection = -1 ; rowDirection <=1 ; rowDirection++) {
            for (int coldirecTion = -1; coldirecTion <= 1 ; coldirecTion++) {
                if (rowDirection == 0 && coldirecTion == 0){
                    continue;
                }
                int curentRow = row + rowDirection;
                int currentCol = col + coldirecTion;
                boolean validPosition = isValidPosition(matrix, curentRow, currentCol);

                while (validPosition) {
                    if ('q' == matrix[curentRow][currentCol]){
                        return  false;
                    }
                    curentRow = curentRow + rowDirection;
                    currentCol = currentCol + coldirecTion;
                    validPosition = isValidPosition(matrix, curentRow, currentCol);
                }

            }
        }
        return true ;
    }

    private static boolean isValidPosition(char[][] matrix, int curentRow, int currentCol) {
        return curentRow >= 0
                        && curentRow < matrix.length
                        && currentCol >= 0
                        && currentCol < matrix[curentRow].length;

    }
}
