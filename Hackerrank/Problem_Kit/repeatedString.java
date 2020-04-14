import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class repeatedString {

    static int findAsInString(String s, long n){
        int max=s.length();
        if (n >= 0) {
            max = (int) n;
        }
        int a_found=0;
        for (int i = 0; i < max; i++) {
            if(s.charAt(i) == 'a')
            a_found++;
        }
        return a_found;
    }

    /**
     * Find and prints the number of letter a's in the first n letters of Lilah's infinite string
     * @param s string of lowercase English letters that she repeated infinitely many times
     * @param n number of letter's we have to search
     * @return the number of letter a's in the first n letters of the string s
     */
    static long repeatedString(String s, long n) {
        int len=s.length();
        int a_found=findAsInString(s, -1);
        // find occurrences of a in the initial string s
        long times_repeated_s=(n/len);
        long rest=(n % len);
        int a_found_in_rest = findAsInString(s, rest);

        long times_a_found = times_repeated_s * a_found + a_found_in_rest;
        return times_a_found;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = scanner.nextLine();

        // long n = scanner.nextLong();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s="aba";
        long n=10;
        long result = repeatedString(s, n);
        System.out.printf("result: %d%n", result);

        s="a";
        n=1000000000000L;
        result = repeatedString(s, n);
        System.out.printf("result: %d%n", result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        // scanner.close();
    }
}
