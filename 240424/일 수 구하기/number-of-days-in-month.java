import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if(month == 2){
            System.out.println(28);
        }else if(month <= 7){
            if(month % 2 == 0){
                System.out.println(30);
            }else{
                System.out.println(31);
            }
        }else{
            if(month % 2 == 0){
                System.out.println(31);
            }else{
                System.out.println(30);
            }
        }
    }
}