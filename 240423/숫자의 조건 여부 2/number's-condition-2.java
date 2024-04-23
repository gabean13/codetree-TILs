import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        if(a == 5){
            System.out.println("A");
        }
        if(a % 2 == 0){
            System.out.println("B");
        }
    }
}