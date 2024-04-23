import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();

        if(a <= b && a <= c){
            System.out.print(1 + " ");
        }else{
            System.out.print(0 + " ");
        }


        if(a == b && b == c){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

    }
}