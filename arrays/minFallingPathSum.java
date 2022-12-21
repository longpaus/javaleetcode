package arrays;

import java.util.ArrayList;

public class minFallingPathSum {
    public static int minFallingPathSum(int[][] matrix) {
        int[] lowest = { -1 };
        for (int i = 0; i < matrix[0].length; i++) {
            bfs(matrix, 0, i, matrix[0].length, matrix[0][i], lowest);
        }
        return lowest[0];
    }

    public static void bfs(int[][] matrix, int row, int col, int n, int currSum, int[] lowestSum) {
        if (row + 1 < n) {
            if (col - 1 >= 0) {
                bfs(matrix, row + 1, col - 1, n, currSum + matrix[row + 1][col - 1], lowestSum);
            }
            if (col + 1 < n) {
                bfs(matrix, row + 1, col + 1, n, currSum + matrix[row + 1][col + 1], lowestSum);
            }
            bfs(matrix, row + 1, col, n, currSum + matrix[row + 1][col], lowestSum);
        }
        if (lowestSum[0] == -1) {
            lowestSum[0] = currSum;
        }
        if (currSum < lowestSum[0]) {
            lowestSum[0] = currSum;
        }
        return;
    }

}

// ktds
