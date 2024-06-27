import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        String str = sc.nextLine();
        String[] arr = str.split("");
        String alpha = sc.next();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(alpha)){
                num++;
            }
        }

        System.out.println(num);
    }
}