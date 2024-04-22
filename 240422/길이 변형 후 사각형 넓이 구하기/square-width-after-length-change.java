import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 width, length 입력
        long width = sc.nextLong();
        long length = sc.nextLong();

        //가로 + 8, 세로 * 3
        width += 8;
        length *= 3;

        //가로 / 세로 / 넓이  
        System.out.println(width);
        System.out.println(length);
        System.out.println(width*length);
    }
}