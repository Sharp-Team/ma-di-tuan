
import java.util.Scanner;

/**
 *
 * @author Thaycacac
 */
public class Knights2 {

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
        System.out.print("A ");
        if (n < 1 || n > 8) { // A
            System.out.print("B ");
            System.out.println("G ");
            return null;
        } else {
            System.out.print("C ");
            board = new int[n][n];
            board[0][0] = 1;
        }

        System.out.print("D ");
        if (!move(2, 0, 0)) { // D
            System.out.print("E ");
            System.out.println("G ");
            return null;// G
        } else {
            System.out.print("F ");
            display(board, n);
            System.out.println("G ");
            return board; // G
        }
    }

    private static boolean move(int countStep, int xCurrent, int yCurrent) {
        if (countStep > n * n) { // A
            return true; // G
        } else {
            int i = 0;
            while (i < 8) {// B
                int nextX = xCurrent + DX[i];
                int nextY = yCurrent + DY[i]; 
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] == 0) { // C
                    board[nextX][nextY] = countStep;
                    if (move(countStep + 1, nextX, nextY)) { // D
                        return true; // G
                    } else {
                        board[nextX][nextY] = 0; // E
                    }
                }
                i++; // F
            }
            return false; // G
        }
    }

    public static void display(int[][] matrix, int n) {
    }
}
