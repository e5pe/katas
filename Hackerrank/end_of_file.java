
/*
 * End Of File (commonly abbreviated EOF) is a condition in a computer operating
 * system where no more data can be read from a data source.
 * In Java we have Scanner.hasNext() for this problem.
 */
import java.io.*;
import java.util.*;

public class end_of_file {

    public static void main(String[] args) {
        // Read some unknown n lines of input from stdin(System.in) until you reach EOF;
        // each line of input contains a non-empty String.
        Scanner scan = new Scanner(System.in);
        int numLinea = 0;
        while (scan.hasNext()) {
            String linea = scan.nextLine();
            numLinea++;
            // For each line, print the line number, followed by a single space, and then
            // the line content received as input.
            System.out.printf("%-1d %s%n", numLinea, linea);
        }
        scan.close();
    }
}