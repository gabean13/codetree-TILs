import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //실수 a, b입력
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        //a + b 소수점 둘째자리까지 출력
        System.out.printf("%.2f", a + b);
    }
}