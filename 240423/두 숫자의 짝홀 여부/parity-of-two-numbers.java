import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(getValue(a));
        System.out.println(getValue(b));
    }

    public static String getValue(long num){
        return num % 2 == 0 ? "even" : "odd";
    }
}