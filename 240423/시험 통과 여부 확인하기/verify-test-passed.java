import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long score = sc.nextLong();

        if(score >= 80){
            System.out.println("pass");
        }else{
            System.out.println((80 - score) +" more score");
        }
    }
}