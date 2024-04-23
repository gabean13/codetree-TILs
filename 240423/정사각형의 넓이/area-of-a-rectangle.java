import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = n*n;

        System.out.println(sum);
        if(n < 5){
            System.out.println("tiny");
        }
    }
}