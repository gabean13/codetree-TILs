import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        int isASmallThanB = a < b ? 1 : 0;
        int isSame = a == b ? 1 : 0;

        System.out.println(isASmallThanB + " " + isSame);
    }
}