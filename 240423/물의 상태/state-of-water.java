import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long temperature = sc.nextLong();

        if(temperature < 0){
            System.out.println("ice");
        }else if(temperature >= 100){
            System.out.println("vapor");
        }else{
            System.out.println("water");
        }
    }
}