import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if(a > b){
            System.out.print(a - b);
        }else{
            System.out.print(b - a);
        }
    }
}