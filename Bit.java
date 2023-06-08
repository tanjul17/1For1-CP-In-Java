import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        while (t > 0) {
            String n = sc.next();
            if (n.contains("+")) {
                ++a;
            } else {
                --a;
            }
            t--;
        }
        System.out.println(a);
    }
}
