import java.util.Scanner;

public class stdin_stdout_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.nextLine();
        // There are three lines of input:
        // The first line contains an integer.
        // The second line contains a double.
        Double d = Double.parseDouble(scan.nextLine());
        // The third line contains a String.
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}