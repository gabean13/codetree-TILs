import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if(a <= b){
            if(b <= c){
                System.out.println(b);
            }else if(c <= a){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{  //b <= a
            if(c <= b){
                System.out.println(b);
            }else if(a <= c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }
    }
}