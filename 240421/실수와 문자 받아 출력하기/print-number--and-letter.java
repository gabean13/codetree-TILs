import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자 c 실수 a, b입력
        char c = sc.next().charAt(0);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        //c 출력
        System.out.println(c);

        //a 출력 (소수 둘째자리까지)
        System.out.printf("%.2f\n", a);

        //b 출력 (소수 둘째자리까지)
        System.out.printf("%.2f\n", b);

   }
}