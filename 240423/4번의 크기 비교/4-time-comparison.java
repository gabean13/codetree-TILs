import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();

        isBigger(a,b);
        isBigger(a,c);
        isBigger(a,d);
        isBigger(a,e);
    }

    public static void isBigger(long a, long x){
        if(a > x){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}