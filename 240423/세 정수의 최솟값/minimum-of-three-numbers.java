import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(a <= b && a <= c){  //a가 최솟값인 경우
            System.out.println(a);
        }
        else if(b <= a && b <= c){ //b가 최솟값인 경우
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}