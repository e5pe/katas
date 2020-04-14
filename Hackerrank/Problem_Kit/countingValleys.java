import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    /**
     * This function counts the valleys Gary walked through.
     * A valley is a sequence of consecutive steps above sea level, starting
     * with a step down from sea level and ending with a step up to sea level.
     * @param n the number of steps Gary takes
     * @param s a string describing his path
     * @return an integer that denotes the number of valleys Gary walked through during his hike
     */
    static int countingValleys(int n, String s) {
        // For every step he took, he noted if it was an unhill U, or a downhill, D step.
        // His hikes start and end at sea level = -
        // Each step up or down represents a 1 unit change in altitude.
        int level=0;
        int numberValleys=0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='U')
                level++;
            else // is 'D'
                level--;
            if(level == 0 && s.charAt(i)=='U'){
                numberValleys++;
            }
        }
        return numberValleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
