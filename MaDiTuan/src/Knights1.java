
import java.util.Scanner;

/**
 *
 * @author Thaycacac
 */
public class Knights1 {

    final static int[] DX = {2, 1, -1, -2, -2, -1, 1, 2};
    final static int[] DY = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int n;
    static int board[][] = new int[0][0];

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the size of board: ");

        int input = Integer.parseInt(scan.nextLine());
        solveProblem(input);
    }

    public static int[][] solveProblem(int input) {
        n = input;
        if (n < 1 || n > 8) {
            System.err.println("Input must be in rage [1, 8]");
            return null;
        } else {
            board = new int[n][n];
            board[0][0] = 1;
        }

        if (!move(2, 0, 0)) {
            System.err.println("The solution does not exist");
            return null;
        } else {
            display(board, n);
            return board;
        }
    }

    private static boolean move(int countStep, int xCurrent, int yCurrent) {
        if (countStep > n * n) {
            return true;
        }
        for (int i = 0; i < 8; i++) {
            int nextX = xCurrent + DX[i];
            int nextY = yCurrent + DY[i];
            if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] == 0) {
                board[nextX][nextY] = countStep;
                if (move(countStep + 1, nextX, nextY)) {
                    return true;
                } else {
                    board[nextX][nextY] = 0;
                }
            }
        }
        return false;
    }

    public static void display(int[][] matrix, int n) {
        int i, j;
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
