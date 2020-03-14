import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * John works at a clothing store. He has a large pile of socks that he must
 * pair by color for sale. Given an array of integers representing the color of
 * each sock, determine how many pairs of socks with matching color there are.
 * 
 * For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2]. There is
 * one pair of color 1, and one of color 2. There are three odd socks left, one
 * for each color. The number of pairs is 2.
 */

public class sock_Merchant {

    /***
     * It returns an integer representing the number of matching pairs of socks that
     * are available.
     * 
     * @param n  the number of socks in the pile
     * @param ar the colors of each sock
     * @return an integer representing the number of matching pairs of socks that
     *         are available
     */
    static int sockMerchant(int n, int[] ar) {
        int numPairs = 0;
        if (ar.length == 0){
            return numPairs;
        }
        Arrays.sort(ar); // O(nlogn)
        for (int i = 0; i < ar.length-1; i++) {
            System.out.println(ar[i]);
            if (i < ar.length && ar[i] == ar[i + 1]) {
                numPairs++;
                // if the next is pair with i, we jump one place
                i = i + 1;
            }
        }
        return numPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
