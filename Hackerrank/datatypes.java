
/*
 * Given an input integer, you must determine which primitive data types are
 * capable of properly storing that input.
 */
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // denotes the number of test cases
        // each test case is compound of a single line with an integer, n,
        // which can be arbitrarily large or small
        for (int i = 0; i < t; i++) {

            try {
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in:");
                // you must determine if the given primitives are capable of storing it. If yes, then print: 
                if (n >= -128 && n <= 127)
                    System.out.println("* byte");
                // if there is more than one appropiate data type, print each one on its own line
                // order them by size byte < short < int < long
                // short  -32,768 - 32,767
                if(n >= Math.pow(-2,15) && n <= Math.pow(2,15)-1) {
                    System.out.println("* short");
                }
                // int min: -2^31 max: 2^31-1
                if(n >= Math.pow(-2,31) && n <= Math.pow(2,31)-1) {
                    System.out.println("* int");
                }
                // long min: -2^63 max: 2^63-1
                if(n >= Math.pow(-2,63) && n <= Math.pow(2,63)-1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
