import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)){//평년
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}