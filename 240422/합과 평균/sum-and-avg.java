import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        long sum = a + b;
        
        System.out.printf("%d %.1f", sum, (double)sum/2);
    }
}