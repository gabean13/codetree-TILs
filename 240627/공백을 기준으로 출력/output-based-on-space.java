import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 2; i++){
            String line = sc.nextLine();
            String[] arr = line.split("");
            for(int j = 0; j < arr.length; j++){
                if(arr[j].equals(" ")){
                    continue;
                }
                sb.append(arr[j]);
            }
        }
        
        System.out.println(sb.toString());
    }
}