import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
    public PerformOperation isOdd() {
    return (number) -> (number % 2) == 1;
    }

    public PerformOperation isPrime(){
        return (number) -> {
            return (number % 1 == 0) && (number % number == 0);
        };
    }

    public PerformOperation isPalindrome() {
        return (int number) -> {
            String numberToString = String.valueOf(number);
            int tam = numberToString.length();
            // return IntStream.range(0, numberToString.length()/2).noneMatch(i -> numberToString.charAt(i) == numberToString.charAt(numberToString.length()-1-i));
            return IntStream.range(0, numberToString.length()/2).allMatch(i -> numberToString.charAt(i) == numberToString.charAt(numberToString.length()-1-i));
        };
    }
}
public class java_lambda_expressions {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();

  String inputTest = "5\n1 4\n2 5\n3 898\n1 3\n2 12\n";
//   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  Reader inputString = new StringReader(inputTest);
  BufferedReader br = new BufferedReader(inputString);
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
    // String s = "3 785587";
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
