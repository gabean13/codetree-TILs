import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정수 키, 몸무게 입력
        long height = sc.nextLong();
        long weight = sc.nextLong();

        //실수 체질량지수 계산
        double b = (10000 * weight) / (height * height);

        //체질량 지수 출력 / 비만 시 Obesity 출력
        System.out.printf("%d \n", (int)b);
        if(b >= 25){
            System.out.println("Obesity");
        }
    }
}