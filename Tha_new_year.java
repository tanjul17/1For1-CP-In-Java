import java.util.Scanner;

public class Tha_new_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a,Math.min(b, c));
        int max = Math.max(a,Math.max(b, c));
        int ans = max-min;
        System.out.println(ans);
    }
}
