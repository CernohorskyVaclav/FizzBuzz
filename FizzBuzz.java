import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    static List<String> list = Arrays.asList("1", "2", "3");
    static Iterator<String> iterator = list.iterator();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        FizzBuzz(sc);
    }

    static void FizzBuzz(Scanner sc) {
        while (iterator.hasNext()) {
            String x = iterator.next();
            int i = Integer.parseInt(x);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}