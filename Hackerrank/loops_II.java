import java.util.*;
import java.io.*;

class loops_II {
    /*
     * Loops II
     */
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt(); // number of series
        int[] a_inputs = new int[q];
        int[] b_inputs = new int[q];
        int[] n_inputs = new int[q];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            a_inputs[i] = a;
            int b = in.nextInt();
            b_inputs[i] = b;
            int n = in.nextInt();
            n_inputs[i] = n;
            // System.out.printf("%-15d %-15d %d%n", a, b, n);
        }
        in.close();
        for (int i = 0; i < q; i++) {
            int last_result = 0;
            for (int j = 0; j < n_inputs[i]; j++) {
                // a is only used the first time
                int a = j == 0 ? a_inputs[i] : 0;
                int result = (last_result + (int) Math.round(a + Math.pow(2, j) * b_inputs[i]));

                // we have to add last result to current one
                last_result = result;
                // System.out.printf("(%d + 2^%d * %d)%n", a, j, b_inputs[i]);
                // System.out.println("result: " + Integer.toString(result));
                sb.append(Integer.toString(result)).append(" ");
            }
            System.out.println(sb);
            sb.delete(0, sb.length());
        }

    }

}
