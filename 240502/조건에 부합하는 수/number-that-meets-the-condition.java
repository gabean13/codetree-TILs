import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){
            if(!isPrint(i)){
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static boolean isPrint(int num){
        if((num % 2 == 0 && num % 4 != 0) || (num / 8) % 2 == 0 || (num % 7) < 4){
            return false;
        }

        return true;
    }
}