import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSick = 0;

        for(int i = 0;i < 3; i++){
            if(isSick(sc.next(), sc.nextInt()).equals("A")){
                totalSick++;
            }
        }

        if(totalSick >= 2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
    }

    public static String isSick(String symptom, int temper){

        if(symptom.equals("Y")){
            if(temper >= 37){
                return "A";
            }else{
                return "C";
            }
        }else{
            if(temper >= 37){
                return "B";
            }else{
                return "D";
            }
        }

    }
}