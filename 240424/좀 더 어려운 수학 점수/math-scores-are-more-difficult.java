import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A학생 수학 영어 점수 입력
        int AMathScore = sc.nextInt();
        int AEngScore = sc.nextInt();

        //B학생 수학 영어 점수 입력
        int BMathScore = sc.nextInt();
        int BEngScore = sc.nextInt();

        if(AMathScore == BMathScore){
            if(AEngScore > BEngScore){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }else{
            if(AMathScore > BMathScore){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }

    }
}