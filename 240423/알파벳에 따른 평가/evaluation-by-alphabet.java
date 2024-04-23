import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String eng = sc.next();

        if(eng.equals("S")){
            System.out.println("Superior");
        }else if(eng.equals("A")){
            System.out.println("Excellent");
        }else if(eng.equals("B")){
            System.out.println("Good");
        }else if(eng.equals("C")){
            System.out.println("Usually");
        }else if(eng.equals("D")){
            System.out.println("Effort");
        }else{
            System.out.println("Failure");
        }
    }
}