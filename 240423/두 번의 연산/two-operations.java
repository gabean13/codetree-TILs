import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        if(a % 2 == 1){
            a += 3;
        }

        if(a % 3 == 0){
            a /= 3;
        }

        System.out.println(a);
    }
}