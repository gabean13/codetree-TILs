import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //실수 a 입력
        double a = sc.nextDouble();

        //a + 1.5 둘째자리까지 반올림출력
        System.out.printf("%.2f", a + 1.5);
    }
}