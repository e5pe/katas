import java.util.Scanner;

public class printf_formatting {
    // In each line of output there should be two columns:
    // The first column contains the String and is left justified using exactly
    // characters.
    // The second column contains the integer, expressed in exactly digits; if the
    // original input has less than three digits, you must pad your output's leading
    // digits with zeroes.
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            final String s1 = sc.next();
            final int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
