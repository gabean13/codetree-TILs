import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        printValue((a >=b));
        printValue((a > b));
        printValue((a <= b));
        printValue((a < b));
        printValue((a == b));
        printValue((a != b));

    }

    public static void printValue(boolean bool){
        if(bool){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}