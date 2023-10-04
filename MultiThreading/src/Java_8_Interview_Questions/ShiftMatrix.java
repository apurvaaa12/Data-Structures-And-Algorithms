package Java_8_Interview_Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ShiftMatrix {
    public static void main(String[] args){
        int[][] Array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int K = 3;
        int[][] shiftedMatrix = shiftMatrix(Array, K);

        // Print the shifted matrix
        for (int[] row : shiftedMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int[][] shiftMatrix(int[][] matrix, int K){
        int n=matrix.length; //row length
        int m=matrix[0].length; //column length
        int[][] result = new int[n][m];
        for (int k = 0; k < K; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // Calculate the new positions after the shift
                    int newRow = (i + (j + 1) / m) % n;
                    int newCol = (j + 1) % n;

                    // Assign the element to its new position
                    result[newRow][newCol] = matrix[i][j];
                }
            }

            // Update the original matrix for the next shift
            matrix = result.clone();
            result = new int[n][m];
        }
        return matrix;

    }
}
