import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(b > a && b < c){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}