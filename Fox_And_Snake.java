import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String mt[][] = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    mt[i][j] = "#";
                } else {
                    if (i % 4 == 1) {
                        if (j == m - 1) {
                            mt[i][j] = "#";
                        } else {
                            mt[i][j] = ".";
                        }
                    } else {
                        if (j == 0) {
                            mt[i][j] = "#";
                        } else {
                            mt[i][j] = ".";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mt[i][j]);
            }
            System.out.println();
        }
    }
}
