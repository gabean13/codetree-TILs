import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <=n;i++){
            if(!isCompleteNum(i)){
                continue;
            }
            System.out.print(i + " ");
        }
        
    }

    public static boolean isCompleteNum(int num){
        if(num % 2 == 0 || num % 10 == 5 || (num % 3 == 0 && num % 9 != 0)){
            return false;
        }

        return true;
    }
}