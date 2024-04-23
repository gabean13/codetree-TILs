import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long AMathScore = sc.nextLong();
        long AEngScore = sc.nextLong();
        long BMathScore = sc.nextLong();
        long BEngScore = sc.nextLong();

        if(AMathScore > BMathScore && AEngScore > BEngScore){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    
    }
}