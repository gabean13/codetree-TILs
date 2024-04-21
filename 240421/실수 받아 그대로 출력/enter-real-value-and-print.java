import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        //실수 n 입력
        double n = sc.nextDouble();

        //소숫점 둘째자리까지 반올림하여 출력
        System.out.printf("%.2f", n);
    }
}