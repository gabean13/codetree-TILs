import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        if(a < 10 || a > 20){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}