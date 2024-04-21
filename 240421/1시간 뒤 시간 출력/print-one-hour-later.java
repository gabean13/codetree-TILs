import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //h:m 입력
        String time = sc.next();

        //h, m추출
        String[] str = time.split(":");
        int hour =Integer.valueOf(str[0]);
        int min =Integer.valueOf(str[1]);

        //1시간 뒤 출력
        System.out.printf("%d:%d", hour+1, min);
    }
}