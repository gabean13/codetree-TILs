import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();

        if(a % 13 == 0 || a % 19 == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}