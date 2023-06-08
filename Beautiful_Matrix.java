import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[][] matrix = new int[n][n];

        // Read input into the matrix and find the coordinates of the value 1
        int oneRow = 0;
        int oneCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }

        // Calculate the minimum number of row swaps
        int rowSwaps = Math.abs(oneRow - 2);

        // Calculate the minimum number of column swaps
        int colSwaps = Math.abs(oneCol - 2);

        // Calculate the total minimum number of moves
        int totalMoves = rowSwaps + colSwaps;

        // Print the total minimum number of moves
        System.out.println(totalMoves);
    }
}
