
import java.util.Scanner;

/**
 *
 * @author Thaycacac
 */
public class Knights3 {

    final static int[] DX = {2, 1, -1, -2, -2, -1, 1, 2};
    final static int[] DY = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int n;
    static int[][] board = new int[0][0];

    public static void main(String[] args) {
        System.out.println("Input n: ");
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        solveProblem(input);
    }

    public static int[][] solveProblem(int input) {
        if (input < 1 || input > 8) {
            System.err.println("Must be input in range [1, 8]");
            return null;
        } else {
            n = input;
            board = new int[input][input];
        }
        board[0][0] = 1;
        if (!move(2, 0, 0)) {
            System.err.println("Not solution");
            return null;
        } else {
//            display();
            return board;
        }
    }

    private static boolean move(int countStep, int xCurrent, int yCurrent) {
        System.out.print("A ");
        if (countStep > n * n) { // A
            System.out.println("G");
            return true; // G
        } else {
            int i = 0;
            System.out.print("B ");
            while (i < 8) {// B
                int nextX = xCurrent + DX[i];
                int nextY = yCurrent + DY[i];
                System.out.print("C ");
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && board[nextX][nextY] == 0) { // C
                    board[nextX][nextY] = countStep;
                    System.out.print("D ");
                    if (move(countStep + 1, nextX, nextY)) { // D
                        System.out.println("G");
                        return true; // G
                    } else {
                        System.out.print("E ");
                        board[nextX][nextY] = 0; // E
                    }
                }
                System.out.print("F ");
                i++; // F
            }
            System.out.println("G");
            return false; // G
        }
    }

    public static void display() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
