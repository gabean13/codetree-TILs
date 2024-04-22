import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        double sum = a + b;
        double division = a - b;

        System.out.printf("%.2f", sum/division);
    }
}