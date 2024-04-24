import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(a >= b){
            if((b >= c) || (a >= c && c >= b)){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if((a >= c) || (b >= c && c>= a)){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}