import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        if(a % 2 == 0){
            a /= 2;
        }

        if(a % 2 ==  1){
            a += 1;
            a /= 2;
        }

        System.out.println(a);
    }
}