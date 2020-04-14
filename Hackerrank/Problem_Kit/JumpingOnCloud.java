import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {

    /**
     * (t) Thunderheads must be avoid She can jump on any cumulus cloud (cu) having
     * a number that is equal to the number of the current cloud + 1 or 2 It is
     * always possible to win the game. For each game she will get an array of
     * clouds like c = [0,1,0,0,0,1,0], indexed from 0...6. Where 0 means they are
     * safe and 1 means that they must be avoided The number on each cloud is its
     * index in the list
     * 
     * @param c an array of binary integers
     * @return the minimum number of jumps needed to win the game
     */
    static int jumpingOnClouds(int[] c) {
        int minJumpsNeeded = 0;
        int i = 0;
        // special cases
        if (c.length == 2) {
            minJumpsNeeded = 1;
        } else if (c.length > 2) {
            while (i < c.length) {
                // if i is the last index we are done
                if (i == c.length - 1 && c[i] == 0) {
                    i++;
                } else { // we have to jump at least one more position
                    if (i <= c.length - 3 && c[i + 2] == 0) {
                        // we can make a jump of 2
                        i = i + 2;
                    } else if (c[i + 1] == 0) {
                        i++;
                    }
                    minJumpsNeeded++;
                }
            }
        }
        return minJumpsNeeded;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // int[] c = new int[n];

        // String[] cItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        // int cItem = Integer.parseInt(cItems[i]);
        // c[i] = cItem;
        // }
        // For local testing
        int n = 7;
        int[] c = new int[] { 0, 0, 1, 0, 0, 1, 0 };
        int result = jumpingOnClouds(c);
        System.out.printf("result %d%n", result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
