

import java.util.Scanner;

/**
 *
 * @author Sharp Team
 */
public class Knights {

    final static int MAXN = 10;
    final static int[] DX = {2, 1, -1, -2, -2, -1, 1, 2};
    final static int[] DY = {-1, -2, -2, -1, 1, 2, 2, 1};

    private static boolean isSafe(int u, int v, int[][] board, int n) {
        return (0 <= u) && (u < n) && (0 <= v) && (v < n) && (board[u][v] == 0);
    }

    public static void displayBoard(int[][] matrix, int n) {
        int i, j;
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                System.out.printf("%d\t", matrix[i][j]);
            }
            System.out.print("\n\n");
        }
    }

    private static boolean solveProblem(int i, int x, int y, int[][] board, int n) {
        int k, next_x, next_y;
        if (i > n * n) {
            return true;
        }

        for (k = 0; k < 8; k++) {
            next_x = x + DX[k];
            next_y = y + DY[k];
            if (isSafe(next_x, next_y, board, n)) {
                board[next_x][next_y] = i;
                if (solveProblem(i + 1, next_x, next_y, board, n)) {
                    return true;
                } else {
                    board[next_x][next_y] = 0;
                }
            }
        }
        return false;
    }

    public static void deleteBoard(int[][] board, int n) {
        int i, j;
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                board[i][j] = 0;
            }
        }
    }

    public static int checkInput(String input) {
        int n = 0;
        try {
            n = Integer.parseInt(input);
            if (n < 1 || n > 10) {
                throw new Exception();
            }
        } catch (NumberFormatException e) {
            System.err.println("Input invalid, input must be in an integer number range [1, 10]");
        } catch (Exception e) {
            System.err.println("Input out of bound, input must be in range [1, 10]");
            n = 0;
        }
        return n;
    }

    public static int[][] solveKnightTour(int[][] board, String input) {
        int n = checkInput(input);
        if (n > 0) {
            deleteBoard(board, n);
            board = new int [n][n];
            board[0][0] = 1;
            if (!solveProblem(2, 0, 0, board, n)) {
                System.out.println("The solution does not exist");
            } else {
//                displayBoard(board, n);
            }
            displayBoard(board, n);
            return board;
        }
        return null;
    }

    public static void main(String[] arg) {
        int[][] board = new int[MAXN][MAXN];
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the size of board: ");
        String input = scan.nextLine();
        solveKnightTour(board, input);
    }
}
