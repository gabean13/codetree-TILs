import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //세개의 실수 입력
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        //각 실수 소수 셋째자리까지 반올림 출력
        System.out.printf("%.3f \n%.3f \n%.3f \n", a, b, c);
    
    }

}