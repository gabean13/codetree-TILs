import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        char ch = sc.next().charAt(0);

        int num = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].charAt(2) == ch || arr[i].charAt(3) == ch){
                System.out.println(arr[i]);
                num++;
            }
        }

        System.out.println(num);
    }
}