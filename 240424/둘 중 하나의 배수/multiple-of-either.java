import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        if(a % 3 == 0 || a % 5 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}