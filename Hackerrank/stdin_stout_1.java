import java.util.*;
import java.util.stream.IntStream;

public class stdin_stout_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        IntStream rango_tres = IntStream.rangeClosed(0, 2);
        rango_tres.forEach(n -> scanAndPrint(n,scan));
    }

    public static void scanAndPrint(int i, Scanner scan){
            int a = scan.nextInt();
            System.out.println(a);
    }
}
