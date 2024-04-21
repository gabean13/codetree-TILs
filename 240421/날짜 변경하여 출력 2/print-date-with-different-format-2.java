import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        sc.useDelimiter("-");

        //mm-dd-yyyy입력
        long month = sc.nextLong();
        long day = sc.nextLong();
        long year = sc.nextLong();
                
        //yyyy.mm.dd 출력
        System.out.printf("%d.%d.%d", year, month, day);     
    }
}