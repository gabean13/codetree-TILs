import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rightSight = sc.nextDouble();
        double leftSight = sc.nextDouble();

        if(rightSight >= 1.0 && leftSight >= 1.0){
            System.out.println("High");
        }else if(rightSight >= 0.5 && leftSight >= 0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
    }
}