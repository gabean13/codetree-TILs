import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        System.out.println(num);
        
        if(num < 0){
            System.out.println("minus");
        }
    }
}