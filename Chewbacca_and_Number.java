import java.util.Scanner;

public class Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        String s = String.valueOf(x);

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (digit > 4 && (i > 0 || digit != 9)) {
                int invertedDigit = 9 - digit;
                st.append(invertedDigit);
            } else {
                st.append(digit);
            }
        }
        System.out.println(Long.parseLong(st.toString()));
    }
}
