import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 a,b 입력
        long a = sc.nextLong();
        long b = sc.nextLong();

        //a, b 위치 교환
        long temp = a;
        a = b;
        b = temp;

        //출력
        System.out.printf("%d %d", a, b);
    }
}