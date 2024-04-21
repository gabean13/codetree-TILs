import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        //피트 입력
        double n = sc.nextDouble();

        //cm로 환산 + 첫째자리까지 반올림 출력
        System.out.printf("%.1f", n * 30.48);
    }
}