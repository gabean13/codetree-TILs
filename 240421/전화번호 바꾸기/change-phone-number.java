import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        String[] phoneNum = num.split("-");

        System.out.print(phoneNum[0] + "-"+ phoneNum[2] + "-" +  phoneNum[1]);
    }
}