import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 a, b입력
        long a = sc.nextLong();
        long b = sc.nextLong();

        //a * b = a*b / a / b = a/b
        System.out.printf("%d * %d = %d \n", a, b, a*b);
        System.out.printf("%d / %d = %d \n", a, b, a/b);
    }
}