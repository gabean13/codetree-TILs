import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if(month < 3){
            System.out.println("Winter");
        }else if(month < 6){
            System.out.println("Spring");
        }else if(month < 9){
            System.out.println("Summer");
        }else if(month < 12){
            System.out.println("Fall");
        }else{
            System.out.println("Winter");
        }
    }
}