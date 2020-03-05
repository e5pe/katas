import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class if_else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        checkN(N);
    }

    private static void checkN(int n){
        if(n % 2 == 1){ // impar, odd
            System.out.println("Weird");
        } else if(n % 2 == 0){ // par, even
            if(n >= 2 && n <= 5){
                System.out.println("Not Weird");
            } else if(n >= 6 && n <= 20){
                System.out.println("Weird");
            } else if(n>20){
                System.out.println("Not Weird");
            }
        }
    }
}
