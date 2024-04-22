import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        a += 87;
        b %= 10;

        System.out.println(a);
        System.out.println(b);
    }
}