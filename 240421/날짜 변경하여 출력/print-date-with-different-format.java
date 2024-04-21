import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        
        long year = sc.nextLong();
        long month = sc.nextLong();
        long day = sc.nextLong();
        
        System.out.printf("%d-%d-%d", month, day, year);
    }
}