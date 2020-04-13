import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class static_initializer_block {

    private static int B;
    private static int H;
    private static boolean flag = true;
    // Static initialization blocks
    static {
        // read variables from the standard input
        Scanner scan = new Scanner(System.in);
        B = Integer.valueOf(scan.nextLine());
        H = Integer.valueOf(scan.nextLine());
        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag=false;
        }
    }
    /*
     * Two linea of input:
     * - First contains B: the breadth of the parallelogram
     * - Second contains H: the height of the parallelogram
     */

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
